package br.com.lucas.pattern.builder;

public class CarAutomatic {
    private Integer assentos;
    private String motor;
    private Boolean computadorDeBordo;
    private Boolean GPS;

    protected CarAutomatic() {
    }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public Boolean getComputadorDeBordo() {
        return computadorDeBordo;
    }

    public void setComputadorDeBordo(Boolean computadorDeBordo) {
        this.computadorDeBordo = computadorDeBordo;
    }

    public Boolean getGPS() {
        return GPS;
    }

    public void setGPS(Boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "CarAutomatic{" +
                "assentos=" + assentos +
                ", motor='" + motor + '\'' +
                ", computadorDeBordo=" + computadorDeBordo +
                ", GPS=" + GPS +
                '}';
    }
}
