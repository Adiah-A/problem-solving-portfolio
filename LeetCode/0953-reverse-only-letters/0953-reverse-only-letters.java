class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        int left = 0, right = n-1;
        char[] arr = s.toCharArray();

        while(left < right){
            while(left < n && !Character.isLetter(arr[left])){
                left ++;
            }

            while(right >= 0 && !Character.isLetter(arr[right])){
                right --;
            }

            if(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
        }

        return new String(arr);
    }
}