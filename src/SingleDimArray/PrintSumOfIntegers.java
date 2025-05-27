package SingleDimArray;

public class PrintSumOfIntegers {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[]{2,5,1,9,6};
        // tipp: you can use for each as you know the length of array
        for(int value : arr){
            sum = sum+value;
        }
        System.out.println("the sum of array is " +sum);

    }
}
