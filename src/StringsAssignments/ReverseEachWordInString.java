package StringsAssignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a program to reverse a String
 * input: Java is Super output: repuS si avaJ
 */
public class ReverseEachWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );
        String text = sc.nextLine();
        // removes spaces in a string
        String[] textArray = text.trim().split(" ");
        String reverseArray = "";
        for(int i=0;i<textArray.length;i++){
            if(textArray[i] != null){
                String[] value = textArray[i].trim().split("");
                for(int j=(value.length-1);j<=value.length;j--){
                    reverseArray = reverseArray + value[j];
                    if(j == 0){
                        break;
                    }
                }
                reverseArray = reverseArray + " ";

            }
        }
        System.out.println("The reverse of each word is :" +reverseArray);
    }
}
