package Main;

import Tarefa.ListaDeTarefas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Variavel que sera alterada futuramente no submenu update
        String opcaoUsuarioUpdate = "";
        // Criando arrayList para armazenar os objetos (tarefas)
        ArrayList<ListaDeTarefas> tarefas = new ArrayList<ListaDeTarefas>();
        ListaDeTarefas tarefa = null;
        Scanner input = new Scanner(System.in);
        // metódo para chamar a data de hoje
        LocalDateTime diaAtual = LocalDateTime.now();
        //Menu principal
        while (true) {
            System.out.println("O que você deseja fazer: \n 1-ADICIONAR TAREFA \n 2-REMOVER TAREFA \n 3-ALTERAR TAREFA \n 4-LISTAR TAREFAS \n 5-SAIR");
            String opcaoUsuarioMenu = input.nextLine();
            if (opcaoUsuarioMenu.equals("1")) {
                System.out.println("Digite a tarefa| ");
                String tarefaAtual = input.nextLine();
                System.out.println("Quantos dias de limite para tarefa| ");
                int diasParaFazer = input.nextInt();
                input.nextLine();
                tarefa = new ListaDeTarefas(tarefaAtual, diasParaFazer);
                tarefas.add(tarefa);
            } else if (opcaoUsuarioMenu.equals("2")) {
                System.out.println("ID da tarefa para remover: ");
                int idRemovido = input.nextInt();
                boolean removido = tarefas.removeIf(t -> t.getId() == idRemovido);
                input.nextLine();
                if (removido) {
                    System.out.println("\nTarefa encontrada e removida! \n");
                } else {
                    System.out.println("\nTarefa não encontrada! \n");
                }
            } else if (opcaoUsuarioMenu.equals("3")) {
                System.out.println("Qual o ID da tarefa que você irá alterar: ");
                int idUpdate = input.nextInt();
                input.nextLine();
                System.out.println("Oque você deseja alterar: \n 1-Alterar nome \n 2-Alterar Data final \n 3-Sair");
                opcaoUsuarioUpdate = input.nextLine();
                if(opcaoUsuarioUpdate.equals("1")){
                    ListaDeTarefas tarefaEncontrada = ListaDeTarefas.acharTarefaPorId(tarefas.size(),idUpdate,tarefas);
                    String novaTarefa = input.nextLine();
                    tarefaEncontrada.alteraTarefa(novaTarefa);
                } else if (opcaoUsuarioUpdate.equals("2")) {
                    ListaDeTarefas tarefaEncontrada = ListaDeTarefas.acharTarefaPorId(tarefas.size(),idUpdate,tarefas);
                    int a = input.nextInt();
                    tarefaEncontrada.alterarDataFinal(a);
                }
            } else if (opcaoUsuarioMenu.equals("4")) {
                //esse loop vai percorrer por todo ArrayList de objetos tarefa TRANSFORMAR EM ESTATICO JAJA
                for (int i = 0; i < tarefas.size(); i++) {
                    System.out.println(tarefas.get(i));
                }

            } else if (opcaoUsuarioMenu.equals("5")) {
                break;
            } else {
                System.out.println("OPÇÃO INVALIDA!");
                System.out.println("\n".repeat(2));
            }
        }
    }
}
