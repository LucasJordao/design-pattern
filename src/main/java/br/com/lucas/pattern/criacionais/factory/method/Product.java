package br.com.lucas.pattern.criacionais.factory.method;

public abstract class Product {
    private Double valor;

    public Product(Double valor) {
        this.valor = valor;
    }

    public Double getValor(){
        return this.valor;
    };
}
