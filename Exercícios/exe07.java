package Exercícios;

import java.util.Scanner;

public class exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.printf("A média das suas notas é %.1f", media);
        scanner.close();
    }
}
