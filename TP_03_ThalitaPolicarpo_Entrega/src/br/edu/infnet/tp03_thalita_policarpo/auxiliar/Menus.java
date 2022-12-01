package br.edu.infnet.tp03_thalita_policarpo.auxiliar;

import java.util.Scanner;

public class Menus {
    protected static Scanner in = new Scanner(System.in);
    private static int opcao = 0;
    
    public static void menuPrincipal() {
        System.out.println("Menu inicial");
        System.out.println("[1] Cadastrar Aluno");
        System.out.println("[2] Cadastrar Professor");
        System.out.println("[3] Consultar situacao individual");
        System.out.println("[4] Consultar situacao de todos");
        System.out.println("[5] Sair");
        

        System.out.println("Esolha uma opcao: ");
        opcao = in.nextInt();
        
    } 
   
    public static void perguntarNovoCadastro() {
        System.out.println(" ");
        System.out.println("Gostaria de realizar um novo cadastro?");
        System.out.println("[1] Sim");
        System.out.println("[2] Nao");
        opcao = in.nextInt();
    }
    
    public static void perguntarNovaConsulta() {
        System.out.println("Gostaria de realizar uma nova consulta?");
        System.out.println("[1] Sim");
        System.out.println("[2] Nao");
        opcao = in.nextInt();
    }
    
    public static void informarCodigoInexistente() {
        System.out.println("Codigo inexistente");
        System.out.println("[1] informar outro codigo");
        System.out.println("[2] retornar ao menu");
        opcao = in.nextInt();   
    }
    
    public static void opcaoInvalida() {
        System.out.println("A opcao " + opcao + " nao e valida!");
        System.out.println(" ");
    }
    
    public static void informarLimiteDeCadastro() {
        System.out.println("Limite maxido de cadastro atingido!");
        System.out.println(" ");
        opcao = 2;
    }

    
    
 // -----------------------------------------------------------------------
    
    // get - set in Scanner
    public static Scanner getIn() {
        return in;
    }

    public static void setIn(Scanner in) {
        Menus.in = in;
    }

    // get set opcao
    public static int getOpcao() {
        return opcao;
    }

    public static void setOpcao(int opcao) {
        Menus.opcao = opcao;
    }
}
