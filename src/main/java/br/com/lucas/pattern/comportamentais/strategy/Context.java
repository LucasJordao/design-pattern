package br.com.lucas.pattern.comportamentais.strategy;

public class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public Double executeStrategy(Double a, Double b){
        return strategy.execute(a, b);
    }
}
