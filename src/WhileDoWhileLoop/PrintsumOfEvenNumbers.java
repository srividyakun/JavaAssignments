package WhileDoWhileLoop;

/**
 * Print sum of even numbers between 40 to 80
 */
public class PrintsumOfEvenNumbers {

    public static void main(String[] args) {
        int i =40;
        int sum = 0;
        while(i<=80){
            if(i%2==0){
                sum = sum+i;
            }
            i++;
        }
        System.out.println("Sum of even numbers between 40 and 80 are:" + sum);
    }
}
