package Basico;

import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        // Condições simples, nomes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = scanner.nextLine();
        if (nome == "Rafael") {
            System.out.println("Seu nome é o nome de um anjo, sabia?");
        }
        System.out.printf("Bom dia, %s.", nome);
        
        scanner.close();
    }
}
