package Exercícios;

import java.util.Scanner;

public class exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua primeira nota:");
        int num = scanner.nextInt();
        System.out.printf("O sucessor de %d é %d e seu antecessor é %d.", num, num + 1, num - 1);
        scanner.close();
    }
}
