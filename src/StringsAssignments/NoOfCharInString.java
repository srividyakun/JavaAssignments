package StringsAssignments;

import java.util.Scanner;

/**
 * Write java program to count no of characters in a String
 * i/p: Java is Super  o/p : 13
 */
public class NoOfCharInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );

        String text = sc.nextLine();
        System.out.println("No. of characters in given String is :" +text.length());


    }
}
