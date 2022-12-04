package br.edu.infnet.tp03_thalita_policarpo.dominio;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;


public class Professor extends Pessoa1 {
	private Pessoa1 profs = new Pessoa1();
	private static Scanner ler = new Scanner(System.in);


	
	public Professor(){}
	
	@Override
	public String toString() {
		return super.toString() + materia + salario + mesContratacao;
	}
	
	@Override
	public void exibirMenu() {
		System.out.println("Menu Professores");
		System.out.println("[1] Registrar professor;");
		System.out.println("[2] Consultar professor;");
		System.out.println("[3] Consultar todos os professores;");
		System.out.println("[4] Voltar");
 
	}
	
	@Override
	public void registrar() {
		try {			
			if(codigoPessoa >= Constante.TAMANHO) {
								
				super.informarLimiteDeCadastro();
				 
			}else {
				profs.cargo= "professor";
				profs.identificacao = codigoPessoa;
				
				System.out.println("Informe o nome do professor:");
				profs.nome = ler.next();
				
				System.out.println("Informe o mes de contratacao:");
				profs.mesContratacao = ler.next();
				
				System.out.println("Informe o salario:");
				profs.salario = ler.nextFloat();
				
				System.out.println("Informe a materia:");
				profs.materia = ler.next();

				System.out.println("Professor cadastrado com sucesso!");	
				System.out.println("codigo de consulta: " + codigoPessoa);
				System.out.println(" ");
				
				pessoas[codigoPessoa] = profs;
				
				
				codigoPessoa++;
			}
		}catch(InputMismatchException exception2) {
		    System.err.println("O salario precisa ser um numero!");
		    
        }finally {
            ler.nextLine();   
        }
	}
	
	@Override
	public void consultarUm() {
		do {
			System.out.println("Informe o codigo de consulta:");
			int codigoConsulta = ler.nextInt();
						
			if(pessoas[codigoConsulta].cargo == "professor" &&codigoConsulta >=0 && codigoConsulta < codigoPessoa ) {
				System.out.println("Nome do professor: " + pessoas[codigoConsulta].nome);		
				System.out.println("Mes de contratacao: " + pessoas[codigoConsulta].mesContratacao);		
				System.out.println("Salario: R$" + pessoas[codigoConsulta].salario);		
				System.out.println("materia: " + pessoas[codigoConsulta].materia );	
				System.out.println("Identificacao: " +  pessoas[codigoConsulta].identificacao);
				System.out.println(" ");
				
				super.perguntarNovaConsulta();
				
			}else {
				super.informarCodigoInexistente();
			}
			
		}while (opcao != 2);
	}
	
	@Override
	public void consultarTodos() {
		for (int i = 0; i < codigoPessoa; i++) {
			if(pessoas[i].cargo == "professor") {
				System.out.println("Nome do profesor: " + pessoas[i].nome);		
				System.out.println("Mes de contratacao: " + pessoas[i].mesContratacao);		
				System.out.println("Salario: R$ " + pessoas[i].salario);		
				System.out.println("Materia: " + pessoas[i].materia);
				System.out.println("Identificacao: " +  pessoas[i].identificacao);
				System.out.println(" ");
			}
		}	
	}
	
	@Override
	public void executar() {
			exibirMenu();
			
			System.out.println("Esolha uma opcao: ");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1: 
				registrar();
				break;
				
			case 2: 
				consultarUm();
				break;
				
			case 3: 
				consultarTodos();
				break;
				
			case 4: 
				
				break;
			
			default:
				opcaoInvalida();
				break;				
			}
	}

}