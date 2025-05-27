package SingleDimArray;

public class PrintAvgOfIntegers {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[]{2,5,3,9,6};
        // tipp: you can use for each as you know the length of array
        for(int value : arr){
            sum = sum+value;
        }
        int avg = sum / arr.length;
        System.out.println("the sum of array is " +avg);

    }
}
