package week2.arraylists;

import java.util.ArrayList;


public class BasicArrayLists2 {


    public static void main(String[] args) {

        ArrayList<Integer> arrayListBasic = new ArrayList<Integer>();

        for (int i=0; i<10 ; i ++){

            int mathRandomNumber = (int) (Math.random() * (101));
            arrayListBasic.add(mathRandomNumber);
        }

        System.out.println("ArrayList : "+arrayListBasic );
    }
}
