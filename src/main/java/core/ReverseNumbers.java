package core;

import java.util.Scanner;

public class ReverseNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); input.close();
        System.out.print("Reverse: ");

        // Start coding
        int reverse = 0;
        while (number > 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        System.out.print(reverse);
        // End coding
    }
}
