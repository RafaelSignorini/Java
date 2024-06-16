package Exercícios;

import java.util.Scanner;

public class exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o comprimento do cateto oposto: ");
        double co = scanner.nextDouble();
        System.out.println("Insira o comprimento do cateto adjacente: ");
        double ca = scanner.nextDouble();
        double hi = Math.hypot(co, ca);
        System.out.printf("O cateto oposto medindo %.2f, e o cateto adjacente medindo %.2f geram uma hipotenusa medindo %.2f.\n", co, ca, hi);
        scanner.close();
    }
}
