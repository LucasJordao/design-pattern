package br.com.lucas.pattern.criacionais.factory.fabstract;

public abstract class Amortecedor {
    String nome;

    public Amortecedor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
