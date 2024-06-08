package Basico;

import java.util.Scanner;

public class exe20 {
    public static void main(String[] args) {
        // Aumento de salários
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de seu salário: ");
        float salario = scanner.nextFloat();

        if (salario < 0) {
            System.out.println("Salário inválido, tente novamente.");
        } else if (salario <= 1421.78) {
            System.out.printf("Seu salário receberá um aumento de %.2f reais, totalizando um salário de %.2f reais.", salario * 0.15, salario * 1.15);
        } else {
            System.out.printf("Seu salário receberá um aumento de %.2f reais, totalizando um salário de %.2f reais.", salario * 0.1, salario * 1.1);
        }
        scanner.close();
    }
}
