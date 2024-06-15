package Aulas;

import java.util.Scanner;

public class aula06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Insira mais um número: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma vale " + soma);
        System.out.printf("A soma vale %d%n", soma);
        scanner.close();
    }
}
