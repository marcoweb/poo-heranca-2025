package app;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public abstract String exibirInformacoes();
}