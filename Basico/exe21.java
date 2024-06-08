package Basico;

import java.util.Scanner;

public class exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o comprimento da primeira reta do triângulo: ");
        float r1 = scanner.nextFloat();

        System.out.println("Insira o comprimento da segunda reta do triângulo: ");
        float r2 = scanner.nextFloat();

        System.out.println("Insira o comprimento da terceira reta do triângulo: ");
        float r3 = scanner.nextFloat();

        if (r1 < r2 + r3 && r2 < r1 + r3 && r3 < r1 + r2) {
            System.out.println("Os segmentos acima podem formar um triângulo.");
        } else {
            System.out.println("Os segmentos acima não podem formar um triângulo.");
        }
        scanner.close();
    }
}
