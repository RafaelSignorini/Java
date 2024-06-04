package Basico;

import java.util.Scanner;

public class exe07 {
    public static void main(String[] args) {
        // Área de um quadrado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o comprimento da parede:");
        float comprimento = scanner.nextFloat();
        System.out.println("Insira a altura da parede:");
        float altura = scanner.nextFloat();

        System.out.printf("A parede tem %.1f metros de comprimento e %.1f metros de altura, com uma área de %.1f metros, são necessários %.1f litros de tinta.", comprimento, altura, comprimento * altura, (comprimento * altura) / 2);

        scanner.close();
    }
}
