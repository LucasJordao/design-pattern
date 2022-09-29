package br.com.lucas.pattern.comportamentais.strategy;

public class ConcreteStrategyMultiply implements Strategy{
    @Override
    public Double execute(Double a, Double b) {
        return a * b;
    }
}
