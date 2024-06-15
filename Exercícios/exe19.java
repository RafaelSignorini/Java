package Exercícios;

import java.util.Scanner;

public class exe19 {
    public static void main(String[] args) {
        // Maior e menor número
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Insira outro número: ");
        int num2 = scanner.nextInt();

        System.out.println("Insira mais um número: ");
        int num3 = scanner.nextInt();

        int maior = num1;
        int menor = num1;

        if (num2 > maior) {
            maior = num2;
        }
        if (num3 > maior) {
            maior = num3;
        }
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }
        System.out.printf("O maior valor é %d e o menor valor é %d", maior, menor);
        scanner.close();
    }
}
