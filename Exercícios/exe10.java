package Exercícios;

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor: ");
        double reais = scanner.nextDouble();
        double dolar = reais / 3.27;
        System.out.printf("Considerando que o dolar vale 3.27 reais, com %.2f reais você pode comprar %.2f dolares.", reais, dolar);
        scanner.close();
    }
}
