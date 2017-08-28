package core;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print("Prime factors are: ");

        // Start coding
        for (int i = 2; i <= number; i ++){
            while (number % i == 0){
                System.out.print(i + " ");
                number /= i;
            }
        }
        // End coding
    }
}
