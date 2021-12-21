package by.htp.ramanouski;

public class No15_NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(202));
        System.out.println(isPalindrome(11011));
        System.out.println(isPalindrome(4004));
    }


    public static boolean isPalindrome(int number) {
        boolean returnedValue = false;
        int value;
        if (number < 0) {
            value = number * -1;
        } else {
            value = number;
        }
        int reverse = 0;
        while (value > 0) {
            int temp = value % 10;
            reverse+=temp;
            reverse *= 10;
            value /= 10;
        }
        reverse/=10;
        if (reverse == number){
            returnedValue = true;
        }
        return returnedValue;
    }
}


