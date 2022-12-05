package br.edu.infnet.tp03_thalita_policarpo.tps;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Menus;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Aluno;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Professor;

public class TP03 {
    private static Scanner in = new Scanner(System.in);
    private static int opcao = 0;

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        do {
            try {
                Menus.menuPrincipal();

                System.out.println("Esolha uma opcao: ");
                opcao = in.nextInt();

                switch (opcao) {
                    case 1:
                        aluno.executar();
                        break;

                    case 2:
                        professor.executar();
                        break;

                    case 3:
                        aluno.consultarTodos();

                        professor.consultarTodos();

                        break;

                    case 4:
                        System.out.println("Processamento Finalizado!");
                        break;

                    default:
                        System.out.println("A opcao " + opcao + " nao e valida!");
                        System.out.println(" ");
                        break;
                }
            } catch (InputMismatchException exception1) {
                System.err.println("a opcao precisa ser um numero de 1 a 4");
            } finally {
                in.nextLine();
            }
        } while (opcao != 4);

    }
}
