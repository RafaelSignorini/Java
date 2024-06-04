package Basico;

import java.util.Scanner;

public class exe17 {
    public static void main(String[] args) {
        // Viagens longas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a distância da viagem:");
        int distancia = scanner.nextInt();

        if (distancia < 0) {
            System.out.println("Valor inválido, tente novamente.");
        } else if (distancia > 200) {
            System.out.printf("Sua viagem será de %d km, você terá que pagar %.2f reais.", distancia, distancia * 0.45);
        } else {
            System.out.printf("Sua viagem será de %d km, você terá que pagar %.2f reais.", distancia, distancia * 0.5);
        }
        scanner.close();
    }
}
