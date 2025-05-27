package StringsAssignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write java program to count no of words in a String
 * i/p: Java is Super  o/p : 3
 */
public class NoOfWordsInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );
        String text = sc.nextLine();
        //Trim: removes leading and trailing spaces within the string
        //split: splits the string with the given regex and return an array
        String[] arr = text.trim().split(" ");
        System.out.println("No. of words in given String is :" +arr.length );


    }
}
