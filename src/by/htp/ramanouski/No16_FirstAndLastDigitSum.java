package by.htp.ramanouski;

public class No16_FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        if (number > 0 && number < 10) {
            return number + number;
        }
        int returnedValue = 0;

        int stored = 0;
        int lastNumber = returnLastNumber(number);
        while (number > 0) {
            int temp = number % 10;
            stored += temp;
            stored *= 10;
            number /= 10;
        }
        int firstNumber = returnLastNumber(stored / 10);
        returnedValue = lastNumber + firstNumber;
        return returnedValue;
    }

    public static int returnLastNumber(int number) {
        return number % 10;
    }
}
