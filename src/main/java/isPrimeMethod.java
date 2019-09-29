
import java.util.Scanner;
import java.math.RoundingMode;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Djon Bon Junzi
 */
public class isPrimeMethod {

    public static void main(String[] args) {
        Scanner makeNewScanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is prime");
        int CheckingNumber = makeNewScanner.nextInt();
        if (isPrime(CheckingNumber) == true) {
            System.out.println("Number is a prime number");
        } else {
            System.out.println("Number is not a prime number");
        }


// logic for calculating if number is prime or not came from java67.com and was written by Paul Javin
    }
        public static boolean isPrime(int number) 
        {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
