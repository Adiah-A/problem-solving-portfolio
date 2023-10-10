class Solution {
    public int lengthOfLongestSubstring(String s) {

        //You need a set to keep track of all elements we've found soo far
        //A start and end pointer too keep track of teh window forming our longest string
        //Update teh set to be accurate

        int start = 0, end = 0;
        HashSet<Character> set = new HashSet<>();
        int longestLength = 0;

        for(end = 0; end < s.length(); end++){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
            }else{
                if(s.charAt(start) == s.charAt(end)){
                    set.remove(s.charAt(start));
                    start ++; 
                }else{
                    while(s.charAt(start) != s.charAt(end)){
                        set.remove(s.charAt(start));
                        start ++; 
                    }
                    set.remove(s.charAt(start));
                    start ++; 
                }


                if(!set.contains(s.charAt(end))){
                    set.add(s.charAt(end));
                }
            }

            longestLength = Math.max(longestLength, (end - start) + 1);

        }

        return longestLength;
        
    }
}