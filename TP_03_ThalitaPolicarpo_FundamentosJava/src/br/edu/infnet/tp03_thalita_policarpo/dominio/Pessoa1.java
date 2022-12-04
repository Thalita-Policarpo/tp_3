package br.edu.infnet.tp03_thalita_policarpo.dominio;

import java.util.Scanner;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;
import br.edu.infnet.tp03_thalita_policarpo.exceptions.PrincipalException;


public class Pessoa1 {
	private static Scanner ler = new Scanner(System.in);
	protected static Pessoa1[] pessoas = new Pessoa1[Constante.TAMANHO];
	protected static int codigoPessoa = 0;
	protected static int opcao = 0;
	protected StringBuilder nomeCompleto = new StringBuilder();
	protected static String nome;
	protected StringBuilder sobreNome = new StringBuilder();
	protected String ultimoNome;
	protected String cargo;
	protected int identificacao;
	protected float av1;
	protected float av2;
	protected String materia;
	protected float salario;
	protected String mesContratacao;
	
	
	public String toString() {
		return codigoPessoa + opcao + nome + sobreNome + ultimoNome + cargo;
	}
	
	public Pessoa1() {} 
	
		
	public static void consultarAlunosProfessores() {
		
		Aluno aluno = new Aluno();
		aluno.consultarTodos();
		
		Professor professor = new Professor();
		professor.consultarTodos();	
	}
	
	public void exibirMenu() {
		System.out.println("Menu inicial");
		System.out.println("[1] Alunos;");
		System.out.println("[2] Professores;");
		System.out.println("[3] Consultar alunos e professores;");
		System.out.println("[4] Sair");
	}
	
	public void executar() throws PrincipalException {}
	
	public void registrar() throws PrincipalException{}
	
	public void consultarUm() {}

	public void consultarTodos() {}
	
	public void informarLimiteDeCadastro() {
		System.out.println("Limite maxido de cadastro atingido!");
		System.out.println(" ");
		opcao = 2;
	}
	
	public void perguntarNovoCadastro() {
		System.out.println(" ");
		System.out.println("Gostaria de realizar um novo cadastro?");
		System.out.println("[1] Sim");
		System.out.println("[2] Nao");
		opcao = ler.nextInt();
	}
	
	public void perguntarNovaConsulta() {
		System.out.println("Gostaria de realizar uma nova consulta?");
		System.out.println("[1] Sim");
		System.out.println("[2] Nao");
		opcao = ler.nextInt();
	}
	
	public void informarCodigoInexistente() {
		System.out.println("Codigo inexistente");
		System.out.println("[1] informar outro codigo");
		System.out.println("[2] retornar ao menu");
		opcao = ler.nextInt();	
	}
	
	public void opcaoInvalida() {
		System.out.println("A opcao " + opcao + " nao e valida!");
		System.out.println(" ");
	}
	
}
