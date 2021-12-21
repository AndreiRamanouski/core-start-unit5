package by.htp.ramanouski;

public class No26_DiagonalStar {


    public static void main(String[] args) {
        printSquareStar(5);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        int counter = 0;
        for (int row = 1; row <= number; row++) {

            for (int col = 1; col <= number; col++) {
                if (row == 1 || col == 1 || row == number ||
                        col == number || row == col
                        || col == (number - row + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            counter++;
            System.out.println();
        }


    }
}
