package ForLoop;

/**
 * Print odd numbers between 200 to 25 reverse order
 */
public class PrintOddNumReverseOrder {
    public static void main(String[] args) {
        for(int i=200 ; i>=25;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
