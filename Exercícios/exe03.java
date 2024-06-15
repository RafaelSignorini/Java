package Exercícios;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira outro valor: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.printf("A soma entre %d e %d vale %d. ", num1, num2, soma);
        scanner.close();
    }
}
