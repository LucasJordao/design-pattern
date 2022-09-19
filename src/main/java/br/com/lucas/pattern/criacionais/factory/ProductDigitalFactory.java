package br.com.lucas.pattern.criacionais.factory;

public class ProductDigitalFactory implements ProductFactory {
    public ProductDigitalFactory() {
    }

    @Override
    public Product createProduct(Double valor) {
        Double valorDigital = valor - 0.29;
        return new ProductDigital(valorDigital);
    }
}
