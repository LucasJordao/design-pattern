package br.com.lucas.pattern.builder;

public interface CarBuilder {
    Builder setAssentos(Integer number);
    Builder setMotor(String engine);
    Builder setComputadorDeBordo();
    Builder setGPS();
}
