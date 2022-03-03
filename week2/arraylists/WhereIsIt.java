package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args) {


        ArrayList<Integer> arrayListBasic = new ArrayList<Integer>();



        for (int i = 0; i < 10; i++) {

            int mathRandomNumber = (int) (Math.random() * (51));
            arrayListBasic.add(mathRandomNumber);
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("ArrayList : "+ arrayListBasic);
        System.out.println(" Value to find :");
        String valueToFind = scan.nextLine();
        int value = Integer.parseInt(valueToFind);


        int aux= 0;
        for( Integer it: arrayListBasic){

            if( it ==  value ){

                System.out.println(value + " is in slot "+ aux );
            }
            aux++;
        }
    }
}
