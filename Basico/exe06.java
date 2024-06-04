package Basico;

import java.util.Scanner;

public class exe06 {
    public static void main(String[] args) {
        // Tabuada
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro para saber sua tabuada:");
        int num = scanner.nextInt();

        System.out.printf("Aqui está a tabuada de %d: \n%d * 1 = %d \n%d * 2 = %d \n%d * 3 = %d \n%d * 4 = %d \n%d * 5 = %d \n%d * 6 = %d \n%d * 7 = %d \n%d * 8 = %d \n%d * 9 = %d \n%d * 10 = %d", num, num, num, num, num*2, num, num*3, num, num*4, num, num*5, num, num*6, num, num*7, num, num*8, num, num*9, num, num*10);

        scanner.close();
    }
}
