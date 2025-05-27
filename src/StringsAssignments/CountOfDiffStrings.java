package StringsAssignments;

import java.util.Scanner;

/**
 * Write a program to find the count of upper case letters ,lower case letters,digits and special characters in a given String
 * input : JavA5is&Su&p%eR
 */
public class CountOfDiffStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );
        String text = sc.nextLine();
        String[] textArray = text.split("");
        int upperCaseLetter = 0;
        int lowerCaseLetters = 0;
        int digits = 0;
        int specialChar = 0;
        for (String s : textArray) {
            if (s.equals(s.toUpperCase())) {
                upperCaseLetter++;
            } else if (s.equals(s.toLowerCase())) {
                lowerCaseLetters++;
            } else if (s.matches("\\d+")) {
                digits++;
            } else if (s.matches("^a-zA-Z0-9\\s")) {
                specialChar++;
            }
        }
        System.out.println("the count of no of uppercase are " + upperCaseLetter + '\n'
               + " LowerCase Letters are " + lowerCaseLetters + '\n'
                + "digits are " + digits + '\n'
                + "special char " + specialChar );
    }
}
