package core;

import java.util.Scanner;

public class Binary2Decimal {

    public static void main(String[] args) {

        System.out.print("Enter a binary:  ");
        Scanner input = new Scanner(System.in);
        int binary = input.nextInt(); input.close();
        System.out.print("Decimal: ");

        // Start coding
        int decimal = 0;
        int power = 0;
        while (binary > 0){
            decimal += (binary % 10) * Math.pow(2, power);
            binary /= 10;
            power ++;
        }
        System.out.print(decimal);
        // End coding
    }
}