package WhileDoWhileLoop;

/**
 * Print even number between 200 and 500
 */
public class PrintEvenNumbers {
    public static void main(String[] args) {
        int i = 200;
        while(i<=500){
            if(i%2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
