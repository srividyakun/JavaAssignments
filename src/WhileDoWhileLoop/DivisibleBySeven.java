package WhileDoWhileLoop;

/**
 * Print number between 150 to 200 which are divisible by 7
 */
public class DivisibleBySeven {
    public static void main(String[] args) {
        int i = 150;
        while(i<=200){
            if(i%7 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
