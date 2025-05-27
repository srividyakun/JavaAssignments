package StringsAssignments;

import java.util.Scanner;

/**
 * Write a program to reverse a String
 * input: Java is Super output: repuS si avaJ
 */
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );
        String text = sc.nextLine();

        String[] textArray = text.split("");
        String reverseArray = "";
        for(int i=(textArray.length-1);i<=textArray.length;i--){
            reverseArray = reverseArray + textArray[i];
            if(i == 0){
                break;
            }
        }
        System.out.println("The reverse String is : " +reverseArray);
    }
}
