package br.edu.infnet.tp03_thalita_policarpo.dominio;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;


public class Professor extends Pessoa1 {
	private Pessoa1 profs = new Pessoa1();
	private static Scanner in = new Scanner(System.in);


	
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
				in.nextLine();
				
				System.out.println("Informe o nome do professor:");
				profs.nome = in.nextLine();
				
				System.out.println("Informe o mes de contratacao:");
				profs.mesContratacao = in.next();
				
				System.out.println("Informe o salario:");
				profs.salario = in.nextFloat();
				
				System.out.println("Informe a materia:");
				profs.materia = in.next();

				System.out.println("Professor cadastrado com sucesso!");	
				System.out.println("codigo de consulta: " + codigoPessoa + "\n");
				
								
				String[] tokens = Pessoa1.nome.split(" ");
		        profs.nome = tokens[0];
		        for(int i = 1; i < tokens.length-1; i++) {
		        profs.sobreNome.append(tokens[i]).append(" ");
		        }
		        profs.ultimoNome = tokens[tokens.length -1];    
		        profs.nomeCompleto.append(profs.nome).append(" ").append(profs.sobreNome).append(profs.ultimoNome);
			
				
				pessoas[codigoPessoa] = profs;
				
				
				codigoPessoa++;
				
			}
		}catch(InputMismatchException exception) {
		    System.err.println("O salario precisa ser um numero!");
		    
        }finally {
            in.nextLine();   
        }
	}
	
	@Override
	public void consultarUm() {
		do {
		    try {
    			System.out.println("Informe o codigo de consulta:");
    			int codigoConsulta = in.nextInt();
    						
    			if(pessoas[codigoConsulta].cargo == "professor" &&codigoConsulta >=0 && codigoConsulta < codigoPessoa ) {
    				System.out.println("Nome do professor: " + pessoas[codigoConsulta].nomeCompleto);		
    				System.out.println("Mes de contratacao: " + pessoas[codigoConsulta].mesContratacao);		
    				System.out.println("Salario: R$" + pessoas[codigoConsulta].salario);		
    				System.out.println("materia: " + pessoas[codigoConsulta].materia );	
    				System.out.println("Identificacao: " +  pessoas[codigoConsulta].identificacao);
    				System.out.println(" ");
    				
    				super.perguntarNovaConsulta();
    				
    			}else {
    				super.informarCodigoInexistente();
    			}
		    }catch (NullPointerException exception1){
                System.err.println("ainda nao ha professores cadastrados!");
                   
            }
		}while (opcao != 2);
	}
	
	@Override
	public void consultarTodos() {
	    try {
    		for (int i = 0; i < codigoPessoa; i++) {
    			if(pessoas[i].cargo == "professor") {
    				System.out.println("Nome do profesor: " + pessoas[i].nomeCompleto);		
    				System.out.println("Mes de contratacao: " + pessoas[i].mesContratacao);		
    				System.out.println("Salario: R$ " + pessoas[i].salario);		
    				System.out.println("Materia: " + pessoas[i].materia);
    				System.out.println("Identificacao: " +  pessoas[i].identificacao);
    				System.out.println(" ");
    			}
    		}	
	    }catch (NullPointerException exception2){
            System.err.println("ainda nao ha professores cadastrados!");                      
        }
	}
	
	@Override
	public void executar() {
			exibirMenu();
			
			System.out.println("Esolha uma opcao: ");
			opcao = in.nextInt();

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