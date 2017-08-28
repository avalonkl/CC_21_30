package core;

import java.util.Scanner;

public class AbundantNumbers  {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = input.nextInt(); input.close();
        System.out.print("Abundant numbers: ");

        // Start coding
        while (number > 0){
            int sum = 0;
            for (int i = 1; i < number; i ++){
                if (number % i == 0){
                    sum += i;
                }
            }
            if (sum > number){
                System.out.print(number + " ");
            }
            number --;
        }
        // End coding
    }
}
