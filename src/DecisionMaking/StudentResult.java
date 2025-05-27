package DecisionMaking;

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the Score of the student");
        int score = sc.nextInt();

        if(score < 0 || score > 100 ) {
            System.out.println("Invalid score");
            System.out.println("Enter the new Score of the student between 0 to 100 ");
            score = sc.nextInt();
        }

        if(score == 100){
            System.out.println("You scored top marks");
        } else if (score > 85 && score <100) {
            System.out.println("You scored first class");
        } else if (score > 70 && score <= 85) {
            System.out.println("You scored second class");
        } else if (score > 35 && score <= 70) {
            System.out.println("You scored third class");
        } else if (score ==  35) {
            System.out.println("Passed with minimum score");
        } else if (score >0 && score <35) {
            System.out.println("Failed with less score");
        }
        sc.close();
    }
}
