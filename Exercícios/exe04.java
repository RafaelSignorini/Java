package Exercícios;

import java.util.Scanner;

public class exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira qualquer coisa: ");
        String input = scanner.nextLine();
        System.out.printf("O tipo primitivo desse valor é %s\n", input.getClass().getSimpleName());
        System.out.println("Só tem espaços? " + input.trim().isEmpty());
        System.out.println("É um número? " + isNumeric(input));
        System.out.println("É alfabético? " + isAlphabetic(input));
        System.out.println("É alfanumérico? " + isAlphanumeric(input));
        System.out.println("Está em maiúscula? " + input.equals(input.toUpperCase()));
        System.out.println("Está em minsúcula? " + input.equals(input.toLowerCase()));
        System.out.println("Está capitalizada? " + (Character.isUpperCase(input.charAt(0)) && isAlphabetic(input.substring(1))));
        scanner.close();
    }
    private static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }
    private static boolean isAlphabetic(String str) {
        return str.matches("[a-zA-Z]+");
    }
    private static boolean isAlphanumeric(String str) {
        return str.matches("[a-zA-Z0-9]+");
    }
}
