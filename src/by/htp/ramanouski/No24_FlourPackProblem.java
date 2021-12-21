package by.htp.ramanouski;

public class No24_FlourPackProblem {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }



    public static boolean canPack(int bigCount, int smallCount,int goal){
        boolean returnedValue = false;

        if(bigCount<0|| smallCount < 0 || goal<0 || (smallCount < goal && goal < (bigCount * 5)))
        {return false;}

        int bigCountFiveKilos = bigCount * 5;
        int smallCountKilos = smallCount;
        int sum = bigCountFiveKilos+smallCountKilos;
        if(sum >= goal){
            returnedValue = true;
        }

        return returnedValue;
    }
}
