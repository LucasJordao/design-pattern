package br.com.lucas.pattern.comportamentais.strategy;

public class ConcreteStrategySubtract implements Strategy{
    @Override
    public Double execute(Double a, Double b) {
        return a - b;
    }
}
