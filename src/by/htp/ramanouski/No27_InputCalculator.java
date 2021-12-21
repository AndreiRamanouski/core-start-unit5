package by.htp.ramanouski;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27_InputCalculator {


    public static void main(String[] args) throws IOException {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String result = "SUM = %s AVG = %s";

        String input = null;
        int average = 0;
        int sum = 0;
        int numberOfInputs = 0;
        boolean loop = true;
        while (loop) {
            try {
                int temp = Integer.valueOf(reader.readLine());
                sum +=temp;
                numberOfInputs++;
            } catch (NumberFormatException exception) {
                loop = false;
            }
        }
        if(sum == 0 && numberOfInputs == 0){
            average = 0;
        } else {
            average = sum / numberOfInputs;
        }
        System.out.println(result.formatted(sum,average));
    }
}
