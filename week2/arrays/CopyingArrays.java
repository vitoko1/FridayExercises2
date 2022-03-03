package week2.arrays;

public class CopyingArrays {


    public static void main(String[] args) {
        /**
         * Create an array of ten integers
         */
        int[] arrayBasic = new int[10];

        /**
         * Fill the array with ten random numbers (1-100)
         */
        for (int i = 0; i < arrayBasic.length; i++) {

            int mathRandomNumber = (int) (Math.random() * (101));
            arrayBasic[i] = mathRandomNumber;

        }
        /**
         * Copy the array into another array of the same capacity
         */
        int[] arrayBasic2 = arrayBasic;
        System.out.println("");
        System.out.print("Array 1: ");
        /**
         * Display the contents of both arrays
         */
        for (int i = 0; i < arrayBasic.length; i++) {


            System.out.print(arrayBasic[i] + " ");
        }
        System.out.println("");
        System.out.print("Array 2: ");
        /**
         * Copy the array into another array of the same capacity
         */
        arrayBasic2[arrayBasic2.length - 1] = -7;

        /**
         * Display the contents of both arrays
         */
        for (int i = 0; i < arrayBasic2.length; i++) {


            System.out.print(arrayBasic2[i] + " ");

        }


    }


}
