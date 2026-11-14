package br.com.joaocarloslima.vinteum.model;

public class Carta {
    private final int numero;
    private final Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public int getNumero() {
        return numero;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public int getValor() {
        if (numero > 10) {
            return 10;
        }
        return numero;
    }

    public String getImagem() {
        String nome = String.valueOf(numero);
        switch (numero) {
            case 1:
                nome = "Ace";
                break;
            case 11:
                nome = "Jack";
                break;
            case 12:
                nome = "Queen";
                break;
            case 13:
                nome = "King";
                break;
        }
        return nome + naipe.name() + ".png";
    }
}
