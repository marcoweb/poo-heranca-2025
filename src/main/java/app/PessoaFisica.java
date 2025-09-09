package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PessoaFisica extends Pessoa {
    private LocalDate dataNascimento;
    private String cpf;

    public PessoaFisica(String nome, String endereco, LocalDate dataNascimento, String cpf) {
        this.setNome(nome);
        this.setDataCriacao(LocalDate.now());
        this.setDataNascimento(dataNascimento);
        this.setEndereco(endereco);
        this.setCpf(cpf);
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String exibirInformacoes() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "--- Informações da Pessoa Física ---\n" +
                "Nome: " + this.getNome() + "\n" +
                "Data de Nascimento: " + this.getDataNascimento().format(formatador) + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "------------------------------------";
    }
}
