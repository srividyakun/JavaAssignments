package SwitchStatements;

import java.util.Scanner;

public class VerifyEvenOdd {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        VerifyEvenOdd v = new VerifyEvenOdd();
        v.verifyEvenOdd();
    }

    public void verifyEvenOdd() {
        System.out.println("Enter the number to be verified:");
        int reminder = sc.nextInt() % 2;
        switch (reminder) {
            case 0:
                System.out.println("The number is even");
                break;
            case 1:
                System.out.println("The number is odd");
                break;
        }
    }
}
