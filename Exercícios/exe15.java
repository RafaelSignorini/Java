package Exercícios;

import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira quantos km foram rodados com o esse carro: ");
        double km = scanner.nextDouble();
        System.out.println("Por quantos dias o carro foi alugado? ");
        int dias = scanner.nextInt();
        double valor = km * 0.15 + dias * 60;
        System.out.printf("O valor final do aluguel é de %.2f reais.", valor);
        scanner.close();
    }
}
