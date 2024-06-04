package Basico;

import java.util.Scanner;

public class exe02 {
    public static void main(String[] args) {
        // Variáveis interativas
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual é a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual é o seu peso?");
        float peso = scanner.nextFloat();

        System.out.printf(nome, idade, peso);
        
        scanner.close();
    }
}
