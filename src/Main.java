import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable initializations
        int base, exponent, result = 1;

        //scanner initialization and user inputs
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the base number: ");
        base = scanner.nextInt();

        System.out.print("Please enter the exponent: ");
        exponent = scanner.nextInt();

        //calculating a base to the power of an exponent
        for ( int i = 1; i <= exponent; i++) {
            result *= base;
        }

        //print the result
        System.out.print(base + " to the power of " + exponent + " is " + result);
    }
}