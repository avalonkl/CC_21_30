package core;

import java.util.Scanner;

public class Decimal2Binary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number:  ");
        int decimal = input.nextInt(); input.close();
        System.out.print("Binary: ");

        // Start coding
        String binary = "";
        while (decimal > 0){
            binary = String.valueOf(decimal & 1) + binary;
            decimal /= 2;
        }
        System.out.print(binary);
        // End coding
    }
}
