package Basico;

import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        // Condições simples, notas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua primeira nota:");
        float nota1 = scanner.nextFloat();

        System.out.println("Insira sua segunda nota:");
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if ((nota1 < 0 || nota1 > 10) || (nota2 < 0 || nota2 > 10)) {
            System.out.println("Valores inseridos inválidos, tente novamente.");
        } else {
            System.out.printf("Sua média foi de %.1f pontos.", media);
            if (media >= 6) {
                System.out.println("Você foi aprovado.");
            } else {
                System.out.println("Você foi reprovado.");
            }
        }
        scanner.close();
    }
}
