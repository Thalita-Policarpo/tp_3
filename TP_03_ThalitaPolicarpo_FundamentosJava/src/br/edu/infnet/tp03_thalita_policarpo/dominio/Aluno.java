package br.edu.infnet.tp03_thalita_policarpo.dominio;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;
import br.edu.infnet.tp03_thalita_policarpo.exceptions.*;


public class Aluno extends Pessoa1 {
	private Pessoa1 alunos = new Pessoa1();
	private static Scanner ler = new Scanner(System.in);

	
	
	public Aluno() {}
	
	public Aluno(int codigo, Scanner inav1, Scanner inAv2, Scanner inNome1) {}
	
	@Override
	public String toString() {	
		return super.toString() + av1 + av2 + alunos;
	}
	
	@Override
	public void exibirMenu() {
		System.out.println("Menu Alunos");
		System.out.println("[1] Registrar as notas de um novo aluno;");
		System.out.println("[2] Consultar boletim de um aluno;");
		System.out.println("[3] Consultar notas da turma;");
		System.out.println("[4] Voltar");

	}
	

	
	public void registrar() throws NotaInvalidaException  {
					
	    try {
			if(codigoPessoa >= Constante.TAMANHO) {
								
				super.informarLimiteDeCadastro();
				
			}else {
					alunos.cargo= "aluno";
					alunos.identificacao = codigoPessoa;
					
					System.out.println("Informe o nome do aluno:");
					alunos.nome = ler.nextLine();

				    System.out.println(" Informe a nota da Avaliacao 1:");
				    alunos.av1 = ler.nextFloat();

					System.out.println("Informe a nota da Avaliacao 2:");
					alunos.av2 = ler.nextFloat();

					
					if (alunos.av1 < 0 || alunos.av1 > 10 || alunos.av2 < 0 || alunos.av2 > 10) {
					    throw new NotaInvalidaException();
					}
					 

					System.out.println("Aluno cadastrado com sucesso!");	
					System.out.println("codigo de consulta: " + codigoPessoa);
					System.out.println(" ");
					
					pessoas[codigoPessoa] = alunos;
			    	
					codigoPessoa++;
		    }			
	    }catch (InputMismatchException exception ) {
	        System.err.println("A nota precisa ser um numero!");  
	        
	    }finally {
            ler.nextLine();   
        }
	}




    private static float media(int codigo) {
		return (pessoas[codigo].av1 + pessoas[codigo].av2) / 2;
	}
	
	private static String status(int codigo) {
		float media = media(codigo);
		
		if(media >= 4 && media < 7) {
			return "Prova final";			
		}else if (media >= 7) {
			return "Aprovado";
		}
		return "Reprovado";
	}
	
	@Override
	public  void consultarUm() {
				
		do {
			System.out.println("Informe o codigo de consulta:");
			int codigoConsulta = ler.nextInt();
						
			if(pessoas[codigoConsulta].cargo == "aluno" && codigoConsulta >=0 && codigoConsulta < codigoPessoa ) {
				System.out.println("Nome do aluno: " + pessoas[codigoConsulta].nome);		
				System.out.println("Nota da AV1: " + pessoas[codigoConsulta].av1);		
				System.out.println("Nota da AV2: " + pessoas[codigoConsulta].av2);		
				System.out.println("Media final: " + media(codigoConsulta));		
				System.out.println("Situacao: " + status(codigoConsulta));					
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
			if(pessoas[i].cargo == "aluno"){
				System.out.println("Nome do aluno: " + pessoas[i].nome);		
				System.out.println("Nota da AV1: " + pessoas[i].av1);		
				System.out.println("Nota da AV2: " + pessoas[i].av2);		
				System.out.println("Media final: " + media(i));	
				System.out.println("Situacao: " + status(i));
				System.out.println("Identificacao: " +  pessoas[i].identificacao);
				System.out.println(" ");
			}
		}
	}
		
	
	public void executar() {
	   
			exibirMenu();
			
			System.out.println("Esolha uma opcao: ");
			opcao = ler.nextInt();

			switch (opcao) {
			case 1:    
                    try {
                        registrar();
                    } catch (NotaInvalidaException e) {
                        
                       
                    }     
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