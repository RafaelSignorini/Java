package Exercícios;

import java.util.Scanner;

public class exe18 {
    public static void main(String[] args) {
        // Ano bissexto
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um ano para saber se é bissexto ou normal: ");
        int year = scanner.nextInt();

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("O ano é bissexto.");
        } else {
            System.out.println("O ano não é bissexto.");
        }
        scanner.close();
    }
}
