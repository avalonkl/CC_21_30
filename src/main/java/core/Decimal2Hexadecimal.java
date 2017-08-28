package core;

import java.util.Scanner;

public class Decimal2Hexadecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number:  ");
        int decimal = input.nextInt(); input.close();
        System.out.print("Octal: ");

        // Start coding
        String hexdecimals = "0123456789ABCDEF";
        String hexdecimal = "";
        while (decimal > 0){
            hexdecimal = hexdecimals.charAt(decimal % 16) + hexdecimal;
            decimal /= 16;
        }
        System.out.print(hexdecimal);




        // End coding
    }
}
