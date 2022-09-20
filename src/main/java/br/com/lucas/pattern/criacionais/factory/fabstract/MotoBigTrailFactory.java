package br.com.lucas.pattern.criacionais.factory.fabstract;

public class MotoBigTrailFactory implements MotoFactory{
    @Override
    public Roda createRoda() {
        return new RodaLigaLeve(18);
    }

    @Override
    public Amortecedor createAmortecedor() {
        return new AmortecedorInvertido("Hhehehe");
    }
}
