package Basico;

import java.util.Scanner;

public class exe09 {
    public static void main(String[] args) {
        // Reajuste salarial
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor de seu salário:");
        float salario = scanner.nextFloat();

        System.out.printf("O aumento dos salários fará com que o seu salário, de %.2f reais, aumente em 15 por cento, ou %.2f reais, assim chegando a %.2f reais.", salario, salario * 0.15, salario * 1.15);

        scanner.close();
    }
}
