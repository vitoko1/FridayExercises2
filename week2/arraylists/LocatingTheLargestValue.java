package week2.arraylists;

import java.util.ArrayList;

public class LocatingTheLargestValue {


    public static void main(String[] args) {


        ArrayList<Integer> arrayListBasic = new ArrayList<Integer>();


        for (int i = 0; i < 10; i++) {

            int mathRandomNumber = (int) (Math.random() * (51));
            arrayListBasic.add(mathRandomNumber);
        }

        System.out.println("ArrayList : " + arrayListBasic);

        int biggest = 0;
        int index = 0;
        for (int i = 0; i < arrayListBasic.size(); i++) {

            if (arrayListBasic.get(i) > biggest) {
                index = i;
                biggest = arrayListBasic.get(i);


            }

        }

        System.out.println("The largest value is " + biggest + " which is in slot " + index);


    }

}






