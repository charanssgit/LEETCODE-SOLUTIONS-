class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int rev = 26 - (ch - 'a');
            int pos = i+1;
            sum = sum + (rev * pos);
        }
        return sum;
    }
}