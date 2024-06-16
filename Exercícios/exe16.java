package Exercícios;

import java.util.Scanner;

public class exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        double num = scanner.nextDouble();
        System.out.printf("O valor digitado foi %.2f e sua porção inteira é %.0f.\n", num, Math.floor(num));
        scanner.close();
    }
}
