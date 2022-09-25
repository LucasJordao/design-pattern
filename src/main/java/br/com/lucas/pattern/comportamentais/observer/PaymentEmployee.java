package br.com.lucas.pattern.comportamentais.observer;

public class PaymentEmployee implements EventListener{
    private String message;
    @Override
    public void update(String message) {
        this.message = message;
        System.out.println(message);
    }
}
