package Basico;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        // Somas básicas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor:");
        int num1 = scanner.nextInt();
        System.out.println("Insira outro valor:");
        int num2 = scanner.nextInt();

        System.out.printf("A soma de %d e %d é %d.", num1, num2, num1 + num2);
        
        scanner.close();
    }
}
