package core;

import java.util.Scanner;

public class Octal2Decimal {

    public static void main(String[] args) {

        System.out.print("Enter an octal:  ");
        Scanner input = new Scanner(System.in);
        int octal = input.nextInt(); input.close();
        System.out.print("Decimal: ");

        // Start coding
        int decimal = 0;
        int power = 0;
        while (octal > 0){
            decimal += (octal % 10) * Math.pow(8, power);
            octal /= 10;
            power ++;
        }
        System.out.print(decimal);
        // End coding
    }
}
