import java.util.Scanner; // importing scanner
public class QuestionTwo {
    //static Scanner object
    static Scanner input = new Scanner(System.in);
    private static Object primenumbers;
    // A prime number is a number that is evenly divisible o
// by itself and 1
static void isPrime() {
    System.out.println("Enter an integer number to check");
     int numberToTest = input.nextInt();
boolean flag = false;
for (int i = 2; i <= numberToTest / 2; ++i) {
// condition for nonprime number
if (numberToTest % i == 0) {
flag = true;
break;
}
}
if (!flag)
System.out.println(numberToTest + " is a prime number.");
else
System.out.println(numberToTest + " is not a primenumber.");
}
public static void main(String[] args) {
    int i = 0;
    int myNumber = 0;
    for (i = 1; i <= 500; i++) {
    int counter = 0;
    for (myNumber = i; myNumber >= 1; myNumber--) {
    if (i % myNumber == 0) {
    counter = counter + 1;
    if (counter == 2){
         primenumbers = primenumbers   + "";
    }
    }
    System.out.println("The prime numbers from 1 to 500 are :");
char[] primeNumbers;
System.out.println(primeNumbers);
// calling the isPrime method in the main method
isPrime();
    }
    }

}
}




