package SwitchStatements;

import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the todays week day :");
        String day = sc.nextLine();
        switch(day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Uff, It is a week day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Ayy, It is Weekend");
                break;
            default:
                System.out.println("Not Valid");
        }
        sc.close();
    }
}
