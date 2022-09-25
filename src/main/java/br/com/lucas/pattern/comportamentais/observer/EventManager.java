package br.com.lucas.pattern.comportamentais.observer;

import java.util.HashMap;
import java.util.HashSet;

public class EventManager {
    private HashMap<String, EventListener> listeners = new HashMap();

    public EventManager() {}

    public void subscribe(String mounth, EventListener listener){
        this.listeners.put(mounth, listener);
    }

    public void unSubscribe(String mounth, EventListener listener){
        this.listeners.remove(mounth, listener);
    }

    public void notify(String mounth, String message){
        this.listeners.forEach((k, v) -> {
            if(k.equalsIgnoreCase(mounth)){
                v.update(message);
            }
        });
    }
}
