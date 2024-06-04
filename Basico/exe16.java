package Basico;

import java.util.Scanner;

public class exe16 {
    public static void main(String[] args) {
        // Par ou ímpar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número:");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O valor %d é par.", num);
        } else {
            System.out.printf("O valor %d é ímpar.", num);
        }
        scanner.close();
    }
}
