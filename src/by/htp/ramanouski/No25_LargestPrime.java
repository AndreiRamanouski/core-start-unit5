package by.htp.ramanouski;

public class No25_LargestPrime {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
    }

    public static long getLargestPrime( int number){

        int largest = 0;
        for (int i = 2; i <= number; i++) {
            while (number%i == 0){
                largest = i;
                number/=i;
            }
            
        }
        if(largest > 0){
        return largest;}
        else {return -1;}
    }
}
