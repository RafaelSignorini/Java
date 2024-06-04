package Basico;

import java.util.Scanner;

public class exe08 {
    public static void main(String[] args) {
        // Calculando descontos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o preço do produto que deseja comprar:");
        float preco = scanner.nextFloat();

        System.out.printf("O produto que deseja comprar custa %.1f e com o desconto de 5 por cento, o valor final do produto será $.1f", preco, preco * 0.95);
        // AVISO:
        // Usar '5%' ao invés de '5 por cento' no código com 'printf' resulta em 12 linhas de erro
        
        scanner.close();
    }
}
