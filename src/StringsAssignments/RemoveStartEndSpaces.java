package StringsAssignments;

import java.util.Scanner;

/**
 * Write a java program to remove all staring and ending spaces from a string
 * input : <space><space><space>hello<space>world<space><space><space>
 *     output: hello<space>world
 */

public class RemoveStartEndSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );

        String text = sc.nextLine();
        System.out.println("Text after removing leading and trailing spaces is :" +text.trim());


    }
}
