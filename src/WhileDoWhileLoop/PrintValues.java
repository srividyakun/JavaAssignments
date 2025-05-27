package WhileDoWhileLoop;

/**
 * Print values from 1 to 100 using while loop
 */
public class PrintValues {

    public static void main(String[] args) {
        int i = 1;
        while(true){
            System.out.println(i);
            i++;
            if(i>100){
                break;
            }
        }
    }
}
