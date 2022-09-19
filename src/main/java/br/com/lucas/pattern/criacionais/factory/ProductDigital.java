package br.com.lucas.pattern.criacionais.factory;

public class ProductDigital extends Product {
    private Double valor;

    public ProductDigital(Double valor) {
        this.valor = valor;
    }

    @Override
    public Double getValor() {
        return valor;
    }
}
