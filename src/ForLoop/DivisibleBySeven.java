package ForLoop;

/**
 * Print number between 150 to 200 which are divisible by 7
 */
public class DivisibleBySeven {
    public static void main(String[] args) {
        for(int i =150;i<=200;i++){
            if(i%7 == 0){
                System.out.print(" "+ i);
            }
        }
    }
}
