package SwitchStatements;

import java.util.Scanner;

public class ArthematicOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Perform arthematic operation for the given values");
        System.out.println("Enter the first number: ");
        int firstValue = sc.nextInt();
        System.out.println("enter the second number: ");
        int secondValue = sc.nextInt();
        System.out.println("Enter the operation to perform");
        String operation = sc.next();

        switch(operation) {
            case "+" :
                System.out.println("Addition of two values : " + (firstValue + secondValue));
                break;
            case "-":
                System.out.println("substraction of two values : " + (firstValue - secondValue));
                break;
            case "*":
                System.out.println("multiplication of two values : " + (firstValue * secondValue));
                break;
            case "/":
                System.out.println("Division of two values :" +(firstValue / secondValue));
                break;
            default:
                System.out.println("Unknown character provided");
                break;

        }
        sc.close();
    }
}
