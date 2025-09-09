package app;

import java.time.LocalDate;

public class PessoaJuridica {
    private String nome;
    private String endereco;
    private LocalDate dataCriacao;
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
        this.setNome(nome);
        this.setDataCriacao(LocalDate.now());
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }



    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }



    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }



    public String getNome() {
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public String getCnpj() {
        return cnpj;
    }

    public String exibirInformacoes() {
        return "--- Informações da Pessoa Jurídica ---\n" +
               "Nome: " + this.getNome() + "\n" +
               "Endereço: " + this.getEndereco() + "\n" +
               "CNPJ: " + this.getCnpj() + "\n" +
               "------------------------------------";
    }
}
