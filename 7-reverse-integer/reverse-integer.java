class Solution {
    public int reverse(int x) {
        int rev = 0;
        int num = Math.abs(x);
      
        while(num >0){
            int div = num % 10;
             if (rev > (Integer.MAX_VALUE - div) / 10) {
                return 0;  
            }
            rev = rev *10+div;
            num /=10;
            
        }
        return (x<0)? (-rev) : rev;
    }
}