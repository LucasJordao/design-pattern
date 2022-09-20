package br.com.lucas.pattern.criacionais.factory.fabstract;

public abstract class Roda {
    Integer aro;

    public Roda(Integer aro) {
        this.aro = aro;
    }

    public Integer getAro() {
        return this.aro;
    }
}
