package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();
        int divider = 2;
        boolean prime = true;

        while (divider < number) {
          if (number % divider == 0) {
            prime = false;
          }

          divider++;
        } 

        System.out.println("Prime number: " + prime);

    }

}