package app;

public class Main {
    public static void main(String[] args) {
        Tarefa[] tarefas = new Tarefa[5];
        Compromisso[] compromissos = new Compromisso[5];

        tarefas[0] = new Tarefa(0, "Teste", false);
        tarefas[4] = new Tarefa(4, "Novo Teste", false);

        compromissos[2] = new Compromisso(0, "Compromisso", "Hoje", "Amanhã");

        System.out.println(tarefas[0].getDescricao());
    }
}