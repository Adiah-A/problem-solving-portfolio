class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));

            if(fast == 1){
                return true;
            }

        }while(slow != fast);

        return false;
    }

    private int square(int n){
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            sum += (num * num);
            n /= 10;
        }

        return sum;
    }
}