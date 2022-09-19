package br.com.lucas.pattern.criacionais.factory;

public class CarAutomaticBuilder extends Builder implements CarBuilder{
    private CarAutomatic carAutomatic;

    private CarAutomaticBuilder(){
        this.carAutomatic = new CarAutomatic();
    }

    public static CarAutomaticBuilder builder() {
        return new CarAutomaticBuilder();
    }

    @Override
    public CarAutomaticBuilder setAssentos(Integer number) {
        this.carAutomatic.setAssentos(number);
        return this;
    }

    @Override
    public CarAutomaticBuilder setMotor(String engine) {
        this.carAutomatic.setMotor(engine);
        return this;
    }

    @Override
    public CarAutomaticBuilder setComputadorDeBordo() {
        this.carAutomatic.setComputadorDeBordo(true);
        return this;
    }

    @Override
    public CarAutomaticBuilder setGPS() {
        this.carAutomatic.setGPS(true);
        return this;
    }

    public CarAutomatic build(){
        return this.carAutomatic;
    }

    @Override
    public String toString() {
        return "CarAutomaticBuilder{" +
                "carAutomatic=" + carAutomatic +
                '}';
    }
}
