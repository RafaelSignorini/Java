package Basico;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        // Média aritmética
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua primeira nota:");
        float nota1 = scanner.nextFloat();
        System.out.println("Insira sua segunda nota:");
        float nota2 = scanner.nextFloat();

        System.out.printf("A primeira nota é %.1f, a segunda nota é %.1f, e a média de ambas é %.1f.", nota1, nota2, (nota1 + nota2) / 2);

        scanner.close();
    }
}
