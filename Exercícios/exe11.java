package Exercícios;

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o comprimento da parede que deseja pintar: ");
        double comprimento = scanner.nextDouble();
        System.out.println("Agora insira a altura da parede: ");
        double altura = scanner.nextDouble();
        double tinta = (comprimento * altura) / 2;
        System.out.printf("O total de tinta necessária para pintar essa parede são %.1f.", tinta);
        scanner.close();
    }
}
