package by.htp.ramanouski;

public class No14_SumOdd {

    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(13,13));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static long sumOdd(int start, int end) {
        long count = 0;
        if((start <= 0 || end <= 0) || (end < start)){return -1;}
        else {
            for (int i = start; i <= end; i++) {
                if(idOdd(i)){
                    count+=i;
                }
            }
        }
        return count;
    }

    public static boolean idOdd(int parameter) {
        boolean returnedValue = false;
        if (parameter < 0) {
            return false;
        } else {
            if (parameter % 2 == 1) {
                returnedValue = true;
            }
        }
        return returnedValue;
    }
}
