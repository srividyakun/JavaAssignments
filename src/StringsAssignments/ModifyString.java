package StringsAssignments;

import java.util.Scanner;

/**
 * Write a java program to modify the string in the following pattern
 *  Change the odd words to upper case and reverse the even words
 *  input: This is a test String  o/p: THIS si A tset STRING
 */
public class ModifyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : " );
        String text = sc.nextLine();

        String[] textArray = text.trim().split(" ");
        String modifiedArray = "";
        int count = 1;
        for(int i =0;i<textArray.length;i++){
            if(count % 2==0){
                String[] word = textArray[i].trim().split("");
                for(int j= (word.length-1);j<=word.length;j-- ){
                    modifiedArray = modifiedArray + word[j];
                    if(j == 0){
                        break;
                    }
                }
            }else{
                modifiedArray = modifiedArray + textArray[i].toUpperCase();
            }
            count++;
            modifiedArray = modifiedArray + " ";
        }
        System.out.println("The modified array is : " +modifiedArray);
    }
}
