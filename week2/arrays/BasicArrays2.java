package week2.arrays;

public class BasicArrays2 {


    public static void main(String[] args) {

        int [] arrayBasic= new int[10];


        for (int i=0 ; i< arrayBasic.length; i++){

            int mathRandomNumber= (int) (Math.random() * (101));
            arrayBasic[i]=mathRandomNumber;


        }

        for (int i=0 ; i< arrayBasic.length; i++){


            System.out.println("Slot "+i+" contains a "+arrayBasic[i]);
        }
    }
}
