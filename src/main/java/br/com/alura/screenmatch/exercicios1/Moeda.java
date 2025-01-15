package br.com.alura.screenmatch.exercicios1;

public enum Moeda {
    REAL(1.0),
    DOLAR(6.0),
    EURO(6.20);

    private final double cotacao;

    Moeda (double cotacao){
        this.cotacao = cotacao;
    }
    public double converterPara(double valorEmReais) {
        return valorEmReais/this.cotacao;
    }
}
