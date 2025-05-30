class Solution {
    public String reverseWords(String s) {
       
        int left = 0, right = 0;
        int n = s.length();
        char[] arr = s.toCharArray();

        for(int next = 0; next < n; next++){
            if(arr[next] != ' ' && next != n-1){
                //System.out.println("next value is: " + arr[next]);
                continue;
            }

            if(next == n - 1){
                right = next;
            }else{
                right = next - 1;
            }

            // System.out.println("Left has value: " + left);
            // System.out.println("Right has value: " + right);
            // System.out.println("Next has value: " + next);

            while(left < right){
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
            left = next + 1; //you will not get back here when it gets invalid

        }

        
        return new String(arr);
    }
}