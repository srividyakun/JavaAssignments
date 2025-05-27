package StringsAssignments;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Write a java program to count the total number of occurrences of a given character in a given String
 * input : Hello World target: l
 * o/p: 3
 */
public class NoOfCharOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );
        String text = sc.nextLine();

        System.out.println("Enter the char to find the total no  of reoccurrences :" );
        String charToFind = sc.nextLine();

        String[] letter = text.split("");
        System.out.println("the array is : "+ Arrays.toString(letter));
        int number=0;
        for(int i = 0; i<text.length();i++){
            if(letter[i].contains(charToFind)){
                number = number + 1;
            }
        }

        System.out.println("Number of char reoccurrences of letter " +charToFind+ " in a string is " +number);
    }
}
