package Exercícios;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.println("É um prazer te conhecer " + nome);
        System.out.printf("Olá %s, tudo bem? ", nome);
        scanner.close();
    }
}
