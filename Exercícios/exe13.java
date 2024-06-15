package Exercícios;

import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de seu salário: ");
        double salario = scanner.nextDouble();
        double aumento = salario * 0.15;
        System.out.printf("Seu salário atual é de %.2f reais, com o aumento de %.2f reais, seu novo salário será %.2f.", salario, aumento, salario + aumento);
        scanner.close();
    }
}
