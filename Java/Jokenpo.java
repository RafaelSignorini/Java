package Java;

import java.util.Scanner;
import java.util.Random;

public class Jokenpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int u;
        
        do {
            System.out.println("[ 0 ] Pedra \n[ 1 ] Papel \n[ 2 ] Tesoura \n[ 3 ] Sair");
            u = scanner.nextInt();
            String usuario = "";
            
            int pc = random.nextInt(3);
            String adversario;

            switch(u) {
                case 0:
                    usuario = "pedra";
                    break;
                case 1:
                    usuario = "papel";
                    break;
                case 2:
                    usuario = "tesoura";
                    break;
                case 3:
                    System.out.println("Jogo terminado. ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Valor inserido inválido, por favor tente novamente. ");
                    continue;
            }

            if (pc == 0) {
                adversario = "pedra";
            } else if (pc == 1) {
                adversario = "papel";
            } else {
                adversario = "tesoura";
            }

            if (pc == u) {
                System.out.printf("Empate%n%nPC: %s%nUsuário: %s%n", adversario, usuario);
            } else if ((pc == 0 && u == 1) || (pc == 1 && u == 2) || (pc == 2 && u == 0)) {
                System.out.printf("O Usuário venceu%n%nPC: %s%nUsuário: %s%n", adversario, usuario);
            } else {
                System.out.printf("O PC venceu%n%nPC: %s%nUsuário: %s%n", adversario, usuario);
            }
            
        } while (u != 3);
        scanner.close();
    }
}
