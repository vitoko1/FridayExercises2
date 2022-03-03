package week2.arrays;

public class LocatingTheLargestValue {


    public static void main(String[] args) {

        int[] arrayBasic = new int[10];


        for (int i = 0; i < arrayBasic.length; i++) {

            int mathRandomNumber = (int) (Math.random() * (101));
            arrayBasic[i] = mathRandomNumber;


        }

        System.out.println("");
        System.out.print("Array  ");

        for (int i = 0; i < arrayBasic.length; i++) {


            System.out.print(arrayBasic[i] + " ");
        }
        System.out.println("");

        int biggest = 0;
        int index = 0;
        for (int i = 0; i < arrayBasic.length; i++) {

            if (arrayBasic[i] > biggest) {

                biggest = arrayBasic[i];
                index = i;
            }
        }

        System.out.println("The largest value is " + biggest);
        System.out.println("It is in slot : " + index);

    }


}
