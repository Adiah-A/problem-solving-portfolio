class Solution {
    public String reversePrefix(String word, char ch) {
        int n = word.length();

        if(n <= 1){
            return word;
        }

        int right = 0;
        char[] arr = word.toCharArray();

        for(int i = 0; i < n; i++){
            if(arr[i] == ch){
                right = i;
                break;
            }
        }

        int left = 0;

        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left ++;
            right --;
        }

        return new String(arr);
    }
}