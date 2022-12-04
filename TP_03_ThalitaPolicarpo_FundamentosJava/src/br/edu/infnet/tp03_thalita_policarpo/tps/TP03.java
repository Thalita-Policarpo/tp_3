package br.edu.infnet.tp03_thalita_policarpo.tps;
import java.util.InputMismatchException;
import java.util.Scanner;
import  br.edu.infnet.tp03_thalita_policarpo.dominio.Pessoa1;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Professor;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Aluno;

public class TP03 {
	private static Scanner in = new Scanner(System.in);
	private static int opcao = 0;

	

    public static void main(String[] args) {
			
		do {
		    try {
				
			        
			        Pessoa1 pessoa = new Pessoa1();
			        pessoa.exibirMenu();
			        
			        System.out.println("Esolha uma opcao: "); 
			        opcao = in.nextInt();
			        
    				switch (opcao) { 
    				case 1: 
    					Aluno aluno = new Aluno();
    					aluno.executar();
    					break; 
    					
    				case 2: 
    					Professor professor = new Professor();
    					professor.executar();
    					break;
    									
    				case 3: 
    					Pessoa1.consultarAlunosProfessores();
    					break;
    
    				case 4: 
    					System.out.println("Processamento Finalizado!");
    					break;
    				
    				default:
    					System.out.println("A opcao " + opcao + " nao e valida!");
    					System.out.println(" ");
    					break;				
    				}
			}catch (InputMismatchException exception1 ) {
			    System.err.println("a opcao precisa ser um numero de 1 a 4");
			}finally {
			    in.nextLine();   
			}
		}while(opcao != 4);	
		
    
    } 
}
