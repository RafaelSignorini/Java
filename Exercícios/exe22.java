package Exercícios;

import java.util.Scanner;

public class exe22 {
    public static void main(String[] args) {
        // Conversor de medidas
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Insira uma medida em metros para converte-lá: ");
        float metros = scanner.nextFloat();

        float km = metros / 1000;
        float hm = metros / 100;
        float dam = metros / 10;
        float dm = metros * 10;
        float cm = metros * 100;
        float mm = metros * 1000;

        System.out.printf("%.0f metros equivalem à: \n", metros);
        System.out.printf("%.3f km \n", km);
        System.out.printf("%.2f hm \n", hm);
        System.out.printf("%.1f dam \n", dam);
        System.out.printf("%.0f dm \n", dm);
        System.out.printf("%.0f cm \n", cm);
        System.out.printf("%.0f mm \n", mm);

        scanner.close();
    }
}
