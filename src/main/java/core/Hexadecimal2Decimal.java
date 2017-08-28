package core;

import java.util.Scanner;

public class Hexadecimal2Decimal {

    public static void main(String[] args) {

        System.out.print("Enter a hexadecimal:  ");
        Scanner input = new Scanner(System.in);
        String hexadecimal = input.nextLine(); input.close();
        System.out.print("Decimal: ");

        // Start coding
        String hexdecimals = "0123456789ABCDEF";
        int decimal = 0;
        for (int power =  0; power < hexadecimal.length(); power ++){
            char rank = hexadecimal.toUpperCase().charAt(hexadecimal.length() - power - 1);
            int value = hexdecimals.indexOf(rank);
            decimal += value * Math.pow(16, power);
        }
        System.out.print(decimal);
        // End coding
    }
}
