package br.com.lucas.pattern.comportamentais.observer;

import java.util.HashSet;

public class PaymentSystem {
    private EventManager event;

    public PaymentSystem(){
        this.event = new EventManager();
    }

    public void pay(String mounth, Double valor){
        if(mounth.equalsIgnoreCase("november")){
            event.notify("NOVEMBER", "Valor pago: "+valor);
        }else{
            event.notify("DECEMBER", "Valor pago: "+(valor - 10.0));
        }
    }

    public EventManager getEvent() {
        return event;
    }
}
