package br.com.lucas.pattern.criacionais.factory.fabstract;

public interface MotoFactory {
    Roda createRoda();
    Amortecedor createAmortecedor();
}
