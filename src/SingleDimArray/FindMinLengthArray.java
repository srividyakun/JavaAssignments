package SingleDimArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Find minimum length word from an array and print it along with its index
 * Input : ["coffee","water","chai","dietcoke"]
 * output : The minimum char 4 in array is :chai at index 2
 */
public class FindMinLengthArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minArray = 0;
        System.out.println("Enter length of an array?");
        int value = sc.nextInt();

        String[] arr = new String[value];
        for(int i=0; i<arr.length;i++){
            System.out.println("Enter value" +(i+1));
            arr[i] = sc.next();
        }
        System.out.println("The values in array are :" + Arrays.toString(arr));
        int i=0;
        int j;
        int minimumIndex=0;
        for(i = 0 ; i<arr.length;i++){
            if(i==0){
                minArray = arr[i].length();
                continue;
            }
            j = arr[i].length();
            if(minArray>j){
                minimumIndex = i;
                minArray = j;
            }
        }

        System.out.println("The minimum char " +minArray + " in array is :" + arr[(minimumIndex)] +" at index "+(minimumIndex));

        
    }
}
