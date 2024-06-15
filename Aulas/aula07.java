package Aulas;

import java.util.Scanner;
import java.lang.Math;

public class aula07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual é o seu nome? ");
        String nome = scanner.nextLine();
        System.out.printf("Olá, %s, tudo bem? \n", nome);
        System.out.println("Insira um valor: ");
        int n1 = scanner.nextInt();
        System.out.println("Insira outro valor: ");
        int n2 = scanner.nextInt();
        int s = n1 + n2;
        int m = n1 * n2;
        float d = n1 / n2;
        int e = (int) Math.pow(n1, n2);
        System.out.printf("As equações possíveis resultam em %d, %d, %.2f e %d", s, m, d, e);
        scanner.close();
    }
}

/*

+          adição
-             subtração
*             multiplicação
/             divisão
**            potência
//            divisão inteira
%             resto da divisão

Exemplos:

5 + 2 == 7                          '=' realiza o recebimento de um valor, 
5 - 2 == 3                          independente do tipo da variável
5 * 2 == 10                         enquanto '==' compara o valor e 
5 / 2 == 2.5                        verifica se é verdadeiro (True) ou 
5 ** 2 == 25                        falso (False)
5 // 2 == 2     (mostra por quanto 
                o número pode ser 
                dividido sem 
                resultar em decimal)

5 % 2 == 1      (mostra o resto da
                divisão decimal)

Ordem de precedência:

1. ()
2. **
3. *, /, //, %
4. +, -

Mais exemplos:

5 + 3 * 2 == 11
3 * 5 + 4 ** 2 == 31
3 * (5 + 4) ** 2 == 243

18 % 2 == 0
122 % 3 == 2
4 ** 3 == 64
81 ** (1/2) == 9
25 ** (1/2) == 5
127 ** (1/3) == 5.026...

*/
