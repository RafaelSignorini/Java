package Exercícios;

import java.util.Scanner;

public class exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma medida em metros: ");
        int metros = scanner.nextInt();
        int cm = metros * 100;
        int mm = metros * 1000;
        System.out.printf("%d metros tem %d centímetros e %d milímetros.", metros, cm, mm);
        scanner.close();
    }
}
