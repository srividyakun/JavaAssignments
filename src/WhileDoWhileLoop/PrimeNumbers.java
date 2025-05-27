package WhileDoWhileLoop;

/**
 * Print prime numbers between 50 to 150
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        int n = 50;
//        while(i<=150){
//            if(i%2==0 || i%3==0|| i%4==0|| i%5==0|| i%6==0|| i%7==0|| i%8==0 || i%9==0|| i%10==0){
//
//            }else{
//                System.out.println("Prime Number" +i);
//            }
//            i++;
//        }


                     //OR


            System.out.println("Prime numbers between 50 and 150 are:");

            for (int num = 50; num <= 150; num++) {
                boolean isPrime = true;

                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.print(num + " ");
                }
            }
        }



}
