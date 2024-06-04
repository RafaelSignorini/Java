package Basico;

import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {
        // Leitor de velocidade de carros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a velocidade do seu carro:");
        int velocidade = scanner.nextInt();

        float multa = (velocidade - 80) * 7;

        if (velocidade < 0) {
            System.out.println("Velocidade inserida inválida, tente novamente.");
        } else if (velocidade <= 80) {
            System.out.println("Você estava dentro da velocidade correta, tenha um bom dia!");
        } else {
            System.out.printf("Você estava a %d km/h acima do limite de velocidade, você será multado em %.2f reais.", velocidade - 80, multa);
        }
        scanner.close();
    }
}
