package jogo_baralho;

public class Jogo_Baralho {

    public static void main(String[] args) {
        Baralho baralho = new Baralho();

        for (int contador = 1; contador <= 52; contador++) {
            System.out.printf("Carta %2d | %S de %S\n", contador, (baralho.carta[contador].valor),
                    (baralho.carta[contador].Naipe));
        }
    }
}
