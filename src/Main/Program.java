package Main;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // metódo para chamar a data de hoje
        LocalDateTime diaAtual = LocalDateTime.now();
        //Menu principal
        while(true){
            System.out.println("O que você deseja fazer: \n 1-ADICIONAR TAREFA \n 2-REMOVER TAREFA \n 3-ALTERAR TAREFA \n 4-LISTAR TAREFAS \n 5-SAIR");
            String opcaoUsuarioMenu = input.nextLine();
            if(opcaoUsuarioMenu.equals("1")){}

            else if(opcaoUsuarioMenu.equals("2")){}

            else if(opcaoUsuarioMenu.equals("3")){}

            else if(opcaoUsuarioMenu.equals("4")){}

            else if(opcaoUsuarioMenu.equals("5")){
                break;
            }

            else{
                System.out.println("OPÇÃO INVALIDA!");
                System.out.println("\n".repeat(2));
            }
        }
    }
}
