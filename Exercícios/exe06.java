package Exercícios;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        double num = scanner.nextDouble();
        double dobro = num * 2;
        double triplo = num * 3;
        double raiz = Math.sqrt(num);
        System.out.printf("O dobro de %.2f é %.2f, o triplo é %.2f e sua raiz é %.2f", num, dobro, triplo, raiz);
        scanner.close();
    }
}
