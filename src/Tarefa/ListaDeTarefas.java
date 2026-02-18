package Tarefa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class ListaDeTarefas {
    // Contador para auto increment do ID
    private static int contador = 1;
    private Integer id;
    private LocalDateTime dataInicio = LocalDateTime.now();
    private LocalDateTime dataFinal;
    private String tarefa;

    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public ListaDeTarefas(String _tarefa,int _diasParaFazer){
        this.id = contador;
        contador++;
        this.tarefa = _tarefa;
        this.dataFinal = dataInicio.plusDays(_diasParaFazer);
    }

    @Override
    public String toString() {
        return "-".repeat(50)+ "\n Tarefa Numero "+ id +"\nData de Inicio: " + dataInicio.format(fmt) + "\n Tarefa :" +tarefa + "\n Data Final: " + dataFinal.format(fmt) + "\n".repeat(2);
    }
    public Integer getId(){
        return this.id;
    }

    public void alteraTarefa(String novaTarefa){
        this.tarefa = novaTarefa;
    }
    public static ListaDeTarefas acharTarefaPorId(int tarefasTamanho, int idUpdate, ArrayList<ListaDeTarefas> tarefas) {
        for (int i = 0; i < tarefasTamanho; i++) {
            ListaDeTarefas list = tarefas.get(i);
            int idPego = list.getId();
            if (idUpdate == idPego) {
                return list;
            }
        }
        return null;
    }
    public void alterarDataFinal(int a){
        this.dataFinal = this.dataInicio.plusDays(a);
    }
    public static void mostrarTarefas(ArrayList tarefas){
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println(tarefas.get(i));
        }
    }
}
