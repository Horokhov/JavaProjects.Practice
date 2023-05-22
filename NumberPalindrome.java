package org;

public class NumberPalindrome {

    //Solution 2 , when converting Integer to the String and comparing elements of the string;
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        int length = string.length();

        for(int i = 0; i < length/2; i++){
            if(string.charAt(i) != string.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }

    //Solution 2 , when comparing one half , and reverse half
    public boolean isPalindrome2(int x) {
        String strin = String.valueOf(x);

        if(x<0 || (x != 0 && x%10 == 0)) return false;
        int reverse = 0;

        while(x<reverse){
            reverse = reverse*10 + x%10;
            x = x/10;
        }

        return (x==reverse || x==reverse/10);
    }
}
