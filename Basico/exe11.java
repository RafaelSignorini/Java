package Basico;

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {
        // Aluguel de carros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o tempo (em dias) no qual o carro foi alugado:");
        int dias = scanner.nextInt();
        System.out.println("Insira a distância (em km) que foi percorrida com o carro:");
        float distancia = scanner.nextFloat();

        System.out.printf("O preço do aluguel totalizou %.2f reais, %d reais pelo tempo alugado enquanto %.2f reais pela distância percorrida.", (dias * 60) + (distancia * 0.15), dias * 60, distancia * 0.15);

        scanner.close();
    }
}
