package Exercícios;

import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a temperatura atual em °C para converter em °F: ");
        double c = scanner.nextDouble();
        double f = c * 9 / 5 + 32;
        System.out.printf("A temperatura %.1f°C equivale a %.1f°F.", c, f);
        scanner.close();
    }
}
