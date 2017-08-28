package core;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        System.out.print("Enter a number:  ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); input.close();
        System.out.print(number + " is ");

        // Start coding
        System.out.print((number) & (number - 1));
        System.out.print(number != 0 && ((number) & (number - 1)) == 0 ? "power of two" : "not power of two");
        // End coding
    }
}
