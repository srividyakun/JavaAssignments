package ForLoop;

/**
 * Print even number between 200 and 500
 */
public class PrintEvenNumbers {
    public static void main(String[] args) {
        System.out.println("The even numbers between 200 and 500 :");
       for(int i=200; i<=500;i++){
           if(i%2==0){
               System.out.print(" " + i);
           }
        }
    }
}
