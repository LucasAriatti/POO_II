package exer04;

import static java.lang.Integer.parseInt;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exer04 {

    public static void main(String[] args) {
        String entrada;
        Set<Integer> Lista = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int numero;
        try {

            while (true) {
                System.out.println("Digite um numrero inteiro ou precione a letra s para sair");
                entrada = sc.next();

                if ("s".equals(entrada.toLowerCase())) {
                    System.out.println("===========================");
                    Lista.forEach(System.out::println);
                    break;
                } else {
                    numero = parseInt(entrada);
                    Lista.add(numero);
                }

            }
        } catch (Exception e) {
            System.err.println("Erro: Ensira apenas numros inteiros ou precione S para sair");;
        }

    }
}
