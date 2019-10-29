package com.company;

public class Numbers {

    public static int sumNumbers(int a, int b) {
        return a + b;
    }

    public Numbers() {
    }

    public static boolean positive(int num){
        if(num > 0)
        {
            return (true);
        }
        else return (false);
    }

    public static boolean negative(int num){
        if(num < 0)
        {
            return (true);
        }
        else return (false);
    }

    @Override
    public String toString() {
        return "Numbers{}";
    }

    public static boolean evenNumber(int num){
        if(num % 2== 0)
        {
            return (true);
        }
        else return (false);
    }
    public static boolean numberIsEvenAndGreaterThanZero(int num){
        if(num %2== 0 && num >0 )
        {
            return (true);
        }
        else return (false);
    }
}