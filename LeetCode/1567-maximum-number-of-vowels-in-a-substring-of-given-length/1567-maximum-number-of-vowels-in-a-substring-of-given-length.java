class Solution {
    public int maxVowels(String s, int k) {
        int left = 0, right = -1;
        int n = s.length();
        int res = Integer.MIN_VALUE;
        int vowelCount = 0;
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');

        while((right < n) && (right - left + 1) < k){
            right ++;
            if(set.contains(s.charAt(right))) vowelCount ++;           
        }

        res = Math.max(res, vowelCount);

        while(right < n){
            if(set.contains(s.charAt(left))) vowelCount --;
            left ++;
            right ++;
            if((right < n) && set.contains(s.charAt(right))) vowelCount ++;
            res = Math.max(res, vowelCount);
        }

        return res;
    }
}