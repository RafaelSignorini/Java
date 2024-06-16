package Exercícios;

import java.util.Scanner;
import java.util.Random;

public class exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Nome do primeiro aluno: ");
        String aluno1 = scanner.nextLine();
        System.out.println("Nome do segundo aluno: ");
        String aluno2 = scanner.nextLine();
        System.out.println("Nome do terceiro aluno: ");
        String aluno3 = scanner.nextLine();
        System.out.println("Nome do quarto aluno: ");
        String aluno4 = scanner.nextLine();
        String[] lista = {aluno1, aluno2, aluno3, aluno4};
        int index = random.nextInt(lista.length);
        String escolhido = lista[index];
        System.out.printf("O aluno escolhido foi %s.", escolhido);
        scanner.close();
    }
}
