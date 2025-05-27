package MultiDimenArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Print sum of the elements in a multidimesional
 * input :  1 8 4
 *          9 7 2
 *          7 6 4
 * Output : 48
 */
public class PrintSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int row = sc.nextInt();
        System.out.println("Enter no of columns");
        int column = sc.nextInt();

        System.out.println("Enter array elements");
        int[][] insertValues = new int[row][column];
        for(int i=0; i<row;i++){
            for(int j=0;j<column;j++){
                insertValues[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row;i++){
            System.out.println("The sum is :" + Arrays.toString(insertValues[i]));
        }


        int sum =0;
        for(int i=0; i<row;i++){
            for(int j=0;j<column;j++){
                sum = sum+insertValues[i][j];
            }
        }
        System.out.println("The sum is :" + sum);
    }

}
