package jogo_baralho;

public class Baralho {
  public Carta[] carta = new Carta[52];

  public Baralho() {
    String nomeNaipe = "", valorCarta = "";
    int posicaoVetor = 0;
    for (int naipe = 0; naipe < 4; naipe++) {
      for (int valor = 1; valor <= 13; valor++) {
        switch (naipe) {
          case 0:
            nomeNaipe = "Copa";
            break;
          case 1:
            nomeNaipe = "Espada";
            break;
          case 2:
            nomeNaipe = "Ouro";
            break;
          case 3:
            nomeNaipe = "Paus";
            break;
          default:
            break;
        }

        switch (valor) {
          case 1:
            valorCarta = "Ás";
            break;
          case 11:
            valorCarta = "Valete";
            break;
          case 12:
            valorCarta = "Dama";
            break;
          case 13:
            valorCarta = "Rei";
            break;
          default:
            valorCarta = String.valueOf(valor);
            break;
        }

        carta[posicaoVetor] = new Carta(valorCarta, nomeNaipe);

        if (posicaoVetor < 51) {
          posicaoVetor++;
        } else {
        }
      }
    }
  }
}
