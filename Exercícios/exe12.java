package Exercícios;

import java.util.Scanner;

public class exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor do produto que deseja comprar: ");
        double valor = scanner.nextDouble();
        double preco = valor * 0.95;
        System.out.printf("A loja está com 5 por cento de desconto, o preço final será de %.2f reais.", preco);
        scanner.close();
    }
}
