package Basico;

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
        // Parcelamento e porcentagem
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o preço do produto a ser comprado:");
        float preco = scanner.nextFloat();

        System.out.printf("O produto custa, à vista, %.2f reais, enquanto, parcelado, está por %.2f reais.", preco * 0.9, preco * 1.08);

        scanner.close();
    }
}
