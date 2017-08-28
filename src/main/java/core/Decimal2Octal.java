package core;

import java.util.Scanner;

public class Decimal2Octal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number:  ");
        int decimal = input.nextInt(); input.close();
        System.out.print("Octal: ");

        // Start coding
        String octal = "";
        while (decimal > 0){
            octal = String.valueOf(decimal % 8) + octal;
            decimal /= 8;
        }
        System.out.print(octal);




        // End coding
    }
}
