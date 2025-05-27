package SingleDimArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find max number and print it along with the index
 */
public class FindMaxNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of an array?");
        int value = sc.nextInt();

        int[] arr = new int[value];
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter value" +(i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("The values in array are :" + Arrays.toString(arr));

        int i;
        int maxNum = arr[0];
        for( i = 1; i<arr.length;i++){
            if(maxNum<arr[i]){
                maxNum = arr[i];
            }
        }

        System.out.println("The Max number is :" +maxNum + " at index " +(i-1));
sc.close();
    }
}
