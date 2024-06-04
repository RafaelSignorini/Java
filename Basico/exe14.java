package Basico;

import java.util.Scanner;
import java.util.Random;

public class exe14 {
    public static void main(String[] args) {
        // Jogo do chute
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int pc = random.nextInt(6);

        System.out.println("Insira um número para adivinhar o número gerado pelo PC:");
        int usuario = scanner.nextInt();

        if (usuario < 0 || usuario > 5) {
            System.out.println("Apenas números entre 0 e 5 são válidos. Tente novamente.");
        }
        if (usuario > pc) {
            System.out.println("Quase, tente um valor mais baixo...");
        } else if (usuario < pc) {
            System.out.println("Quase, tente um valor mais alto...");
        } else {
            System.out.println("Parabéns, você ganhou!");
        }
        scanner.close();
    }
}
