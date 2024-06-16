package Exercícios;

import java.util.Scanner;

public class exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um ângulo: ");
        double angulo = scanner.nextDouble();
        double seno = Math.sin(Math.toRadians(angulo));
        double cosseno = Math.cos(Math.toRadians(angulo));
        double tangente = Math.tan(Math.toRadians(angulo));
        System.out.printf("O ângulo %.2f tem o seno de %.2f.\n", angulo, seno);
        System.out.printf("O ângulo %.2f tem o cosseno de %.2f.\n", angulo, cosseno);
        System.out.printf("O ângulo %.2f tem a tangente de %.2f.\n", angulo, tangente);
        scanner.close();
    }
}
