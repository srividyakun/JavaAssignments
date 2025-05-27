package DecisionMaking;

import java.util.Scanner;

public class DayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the todays week day :");
        String day = sc.nextLine();
        if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday")|| day.equalsIgnoreCase("Friday") ) {
            System.out.println(" Uff , Its a week day");
        } else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Yayy, Its week end");
        }else{
            System.out.println("Something went wrong");
        }
        sc.close();
    }
}
