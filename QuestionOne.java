/*
 * write a java program that takes 15 values as inputs from the user, store the values in an array.
 * print the values stored in the array on screen
 * ask user to enter a number, check if that number"entered by the user" is presentin array or not if it is present print(the number found at 
 * index) and the text number not found in this array.
 */
import java.util.Scanner; // importing Scanner
import java.util.Arrays; // importing arrays
public class QuestionOne {
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args){
        //creating an array and setting it to empty
        int[] myArray = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        System.out.println("enter 15 numbers to your array:");
        myArray[0] = input.nextInt();
        myArray[1] = input.nextInt();
        myArray[2] = input.nextInt();
        myArray[3] = input.nextInt();
        myArray[4] = input.nextInt();
        myArray[5] = input.nextInt();
        myArray[6] = input.nextInt();
        myArray[7] = input.nextInt();
        myArray[8] = input.nextInt();
        myArray[9] = input.nextInt();
        myArray[10] = input.nextInt();
        myArray[11] = input.nextInt();
        myArray[12] = input.nextInt();
        myArray[13] = input.nextInt();
        myArray[14] = input.nextInt(); //to store the 15th position
         String myList = Arrays.toString(myArray);
        //display the array to the user as a list.
        System.out.println("Our array has th following values:" + myList);
        System.out.println("Enter any number to check if it is the array:");
        int numInput = input.nextInt();
        check(myArray,numInput);
        }
        private static void check(int[] arr, int valueToCheck) {
            // using Linear Search method
            boolean test = false;
            for (int num : arr) {
            // check if the specified num
            // is present in the array or not
            if (num == valueToCheck) {
            test = true;
            break;
            }
            }
            // Print the result
            if (test) {
            System.out.println(valueToCheck + " is in the array.");
            } else {
            System.out.println(valueToCheck + " is not in the array.");
            }
}
}