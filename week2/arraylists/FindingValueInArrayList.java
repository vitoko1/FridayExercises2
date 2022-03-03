package week2.arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> arrayListBasic = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {

            int mathRandomNumber = (int) (Math.random() * (51));
            arrayListBasic.add(mathRandomNumber);
        }


        System.out.println("ArrayList : " + arrayListBasic);

        System.out.println("Value to find : ");


        Scanner scan = new Scanner(System.in);


        String valueToFind = scan.nextLine();
        int value = Integer.parseInt(valueToFind);

        for (Integer it : arrayListBasic) {

            if(it == value ){
                System.out.println(it+ " is in the ArrayList");

            }


        }

    }
}
