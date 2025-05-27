package SingleDimArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Reverse the array and print it in console
 * input :["true","false","false","true","false","true"]
 * output :["true","false","true","false","false","true"]
 */
public class RevereArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array :");
        int arraySize = sc.nextInt();
        boolean[] output = new boolean[arraySize];

        for(int i = 0; i < arraySize;i++){
            System.out.println("Enter value : " + (i+1));
            output[i] = sc.nextBoolean();
        }

        System.out.println("The array list of boolean is : " + Arrays.toString(output));
        boolean[] reverseArray = new boolean[output.length];
//        int i = 0;
//            for(int j= (arraySize-1);j>=0;j--) {
//                reverseArray[i] = output[j];
//                i++;
//            }

        for(int i=0;i<output.length;i++){
            reverseArray[output.length - i-1] = output[i];
        }

        System.out.println("the reverse array is : " + Arrays.toString(reverseArray));
    }
}
