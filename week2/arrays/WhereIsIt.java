package week2.arrays;

import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args) {


        int[] arrayBasic = new int[10];

        /**
         * Fill the array with ten random numbers (1-50)
         */
        for (int i = 0; i < arrayBasic.length; i++) {

            int mathRandomNumber = (int) (Math.random() * (51));
            arrayBasic[i] = mathRandomNumber;

        }

        System.out.println("");
        System.out.print("Array : ");

        for (int i = 0; i < arrayBasic.length; i++) {


            System.out.print(arrayBasic[i] + " ");
        }
        System.out.println("");


        Scanner scan = new Scanner(System.in);

        System.out.println(" Value to find :");
        String valueToFind= scan.nextLine();
       int value=  Integer.parseInt(valueToFind);
       boolean aux=false;
        for (int i = 0; i < arrayBasic.length; i++) {

            if(arrayBasic[i]== value ){
                System.out.println(value+ "  is int the slot "+ i);
                aux=true;

            }
        }

        if(!aux){

            System.out.println(value+ " is not in the array.");
        }

    }


}
