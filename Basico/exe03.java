package Basico;

import java.util.Scanner;

public class exe03 {
    public static void main(String[] args) {
        // Script
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        // Maneira explícita
        System.out.printf("Olá, " + nome + " prazer em te conhecer.");

        // Melhor maneira
        System.out.printf("Olá, %s. Prazer em te conhecer.", nome);

        scanner.close();
    }
}
