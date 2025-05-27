package SingleDimArray;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int sum = 0;
        String[] arr1 = new String[]{"Chai","Coffee"};
        String[] arr2 = new String[]{"Milk","Water","Coke"};
        String[] arr3 = new String[arr1.length+arr2.length];
        // tipp: you can use for each as you know the length of array
        for(int i = 0;i<arr1.length;i++){
           arr3[i] = arr1[i];
        }for(int j=0;j<arr2.length;j++){
            arr3[j+arr1.length]=arr2[j];
        }
        System.out.println("the new array is "  );

       // for(int i =0;i<arr3.length;i++){
            System.out.println(Arrays.toString(arr3));
      //  }

    }
}
