package DecisionMaking;

import java.util.Scanner;

public class VerifyEvenOdd {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       VerifyEvenOdd v = new VerifyEvenOdd();
       v.verifyEvenOdd();
    }

    public void verifyEvenOdd() {
        System.out.println("Enter the number to be verified:");
        if(sc.nextInt()%2==0){
            System.out.println("The number is even");
        }else {
            System.out.println("The number is odd");
        }
        sc.close();
    }
}
