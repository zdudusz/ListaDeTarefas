package Tarefa;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ListaDeTarefas {
    private LocalDateTime dataInicio = LocalDateTime.now();
    private LocalDateTime dataFinal;
    private String tarefa;


    public ListaDeTarefas(String _tarefa,LocalDateTime _dataFinal){
        this.tarefa = _tarefa;
        this.dataFinal = _dataFinal;
    }

    @Override
    public String toString() {
        return "-".repeat(50)+ "\nData de Inicio: " + dataInicio + "\n Tarefa :" +tarefa + "\n Data Final: " + dataFinal + "\n".repeat(2);
    }
}
