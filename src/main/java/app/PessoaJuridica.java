package app;

import java.time.LocalDate;

public class PessoaJuridica extends Pessoa {
    private String nomeFantasia;
    private String cnpj;

    public PessoaJuridica(String nome, String endereco, String nomeFantasia, String cnpj) {
        this.setNome(nome);
        this.setDataCriacao(LocalDate.now());
        this.setEndereco(endereco);
        this.setNomeFantasia(nomeFantasia);
        this.setCnpj(cnpj);
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    @Override
    public String exibirInformacoes() {
        return "--- Informações da Pessoa Jurídica ---\n" +
               "Nome: " + this.getNome() + "\n" +
               "Endereço: " + this.getEndereco() + "\n" +
               "CNPJ: " + this.getCnpj() + "\n" +
               "------------------------------------";
    }
}
