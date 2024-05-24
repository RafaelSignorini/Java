package Java;

public class ArrayTests {
    public static void main(String[] args) {
        // Basic formula
        String[] weekDays;
        weekDays = new String[7];

        weekDays[0] = "Domingo";
        weekDays[1] = "Sergunda";
        weekDays[2] = "Terça";
        weekDays[3] = "Quarta";
        weekDays[4] = "Quinta";
        weekDays[5] = "Sexta";
        weekDays[6] = "Sábado";

        System.out.println(weekDays[0] + " é o primeiro dia da semana. ");
        System.out.println(weekDays[1] + " é o segundo dia da semana. ");
        System.out.println(weekDays[2] + " é o terceiro dia da semana. ");
        System.out.println(weekDays[3] + " é o quarto dia da semana. ");
        System.out.println(weekDays[4] + " é o quinto dia da semana. ");
        System.out.println(weekDays[5] + " é o sexto dia da semana. ");
        System.out.println(weekDays[6] + " é o sétimo dia da semana. ");

        // Conventional formula
        int[] anArray = {
            100, 200, 300,
            400, 500, 600,
            700, 800, 900, 1000
        };

        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Element 2 at index 1: " + anArray[1]);
        System.out.println("Element 3 at index 2: " + anArray[2]);
        System.out.println("Element 4 at index 3: " + anArray[3]);
        System.out.println("Element 5 at index 4: " + anArray[4]);
        System.out.println("Element 6 at index 5: " + anArray[5]);
        System.out.println("Element 7 at index 6: " + anArray[6]);
        System.out.println("Element 8 at index 7: " + anArray[7]);
        System.out.println("Element 9 at index 8: " + anArray[8]);
        System.out.println("Element 10 at index 9: " + anArray[9]);
    }
}