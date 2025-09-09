package app;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        // Tarefa[] tarefas = new Tarefa[5];
        // Compromisso[] compromissos = new Compromisso[5];

        // tarefas[0] = new Tarefa(0, "Teste", false);
        // tarefas[4] = new Tarefa(4, "Novo Teste", false);

        // compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");

        // System.out.println(tarefas[0].getDescricao());

        PessoaFisica pf = new PessoaFisica(
            "Marco",
            "Rua Sem Nome, 0",
            LocalDate.of(1980, Month.MARCH, 29),
            "1234323455");
        
        System.out.println(pf.exibirInformacoes());

        PessoaJuridica pj = new PessoaJuridica(
            "FATEC",
            "Av. Shunji Nishimura",
            "FATEC Pompéia",
            "12312314000123");
        
        System.out.println(pj.exibirInformacoes());
    }
}