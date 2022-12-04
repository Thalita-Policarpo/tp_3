package br.edu.infnet.tp03_thalita_policarpo.tps;
import java.util.InputMismatchException;
import java.util.Scanner;
import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;
import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Menus;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Aluno;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Pessoa;
import br.edu.infnet.tp03_thalita_policarpo.dominio.Professor;
import br.edu.infnet.tp03_thalita_policarpo.exceptions.NotaInvalidaException;

public class TP03_ThalitaPolicarpo {
    
    private static Scanner in = new Scanner(System.in);
    private static String tipoPessoa;
    private static String nomePessoa;
    private static float atribuicaoTipoFloat_1;
    private static float atribuicaoTipoFloat_2;
    private static String atribuicaoTipoString_3;
    private static String atribuicaoTipoString_4;
    
    public static void registrarAluno() throws NotaInvalidaException {   
        try {
            if(Pessoa.getCodigoPessoa() >= Constante.TAMANHO) {
                                
                Menus.informarLimiteDeCadastro();
                
            }else {
                Pessoa.setIdentificacao(Pessoa.getCodigoPessoa());
                tipoPessoa= "aluno";
                                
                System.out.println("Informe o nome do aluno:");
                nomePessoa = in.nextLine();
                
                System.out.println("Informe a nota da Avaliacao 1:");
                atribuicaoTipoFloat_1 = in.nextFloat();

                if (atribuicaoTipoFloat_1 < 0 || atribuicaoTipoFloat_1 > 10 ) {
                	throw new NotaInvalidaException();
                }
                
                System.out.println("Informe a nota da Avaliacao 2:");
                atribuicaoTipoFloat_2 = in.nextFloat();
                                	
            	if ( atribuicaoTipoFloat_2 < 0 || atribuicaoTipoFloat_2 > 10) {
            		throw new NotaInvalidaException();
                }
                
                System.out.println("Aluno cadastrado com sucesso!");    
                System.out.println("codigo de consulta: " + Pessoa.getCodigoPessoa());
                System.out.println(" ");
                
                Aluno aluno = new Aluno(nomePessoa, tipoPessoa, Pessoa.getCodigoPessoa(),  atribuicaoTipoFloat_1, atribuicaoTipoFloat_2);
                Pessoa.setCodigoPessoa(Pessoa.getCodigoPessoa() + 1);
                
                Constante.lista.add(aluno);
            } 
        }catch (InputMismatchException exception ) {
            System.err.println("A nota precisa ser um numero!"); 
        }finally {
            in.nextLine();   
        }
        
    }
  
    public static void registrarProfessor() {
        try {
            if(Pessoa.getCodigoPessoa() >= Constante.TAMANHO) {
                                
                Menus.informarLimiteDeCadastro();
                
            }else {
                Pessoa.setIdentificacao(Pessoa.getCodigoPessoa());
                tipoPessoa= "professor";
                                
                System.out.println("Informe o nome do professor:");
                nomePessoa = in.nextLine();
                
                System.out.println("Informe o mes de contratacao:");
                atribuicaoTipoString_3 = in.nextLine();
                
                System.out.println("Informe o salario:");
                atribuicaoTipoFloat_2 = in.nextFloat();

                System.out.println("Informe a materia:");
                atribuicaoTipoString_4 = in.next();
                
                
                System.out.println("Professor cadastrado com sucesso!");    
                System.out.println("codigo de consulta: " + Pessoa.getCodigoPessoa());
                System.out.println(" ");
                 
                Professor profs = new Professor(nomePessoa, tipoPessoa, Pessoa.getCodigoPessoa(),  atribuicaoTipoString_4, atribuicaoTipoFloat_2, atribuicaoTipoString_3);
                Pessoa.setCodigoPessoa(Pessoa.getCodigoPessoa() + 1);
                
                Constante.lista.add(profs);
           
            } 
        }catch (InputMismatchException exception2 ) {
            System.err.println("O salario precisa ser um numero"); 
        }finally {
            in.nextLine();   
        }
    }
    
    
    
	public static void consultarSituacao() {
	    do {
    	    System.out.println("Informe o código de consulta: ");
    	    int codigoConsulta = in.nextInt();
    	    
    	    if(codigoConsulta >=0 && codigoConsulta < Pessoa.getCodigoPessoa()) {
    	       
        	    if(Constante.lista[codigoConsulta].Pessoa.getNome() == "aluno") {
        	        
                    System.out.println("Nome do aluno: " + Constante.lista[codigoConsulta].Pessoa.getNome());    
                    System.out.println("Nota da AV1: " + Constante.lista[codigoConsulta].getAv1());      
                    System.out.println("Nota da AV2: " + Constante.lista[codigoConsulta].nota2);      
                    System.out.println("Media final: " + Constante.lista[codigoConsulta].aMedia);        
                    System.out.println("Situacao: " + Constante.lista[codigoConsulta].oStatus);                  
                    System.out.println("Identificacao: " );                 
                    System.out.println(" ");
        	
        	    }else { 
        	        
                    System.out.println("Nome do profesor: " + Constante.lista[codigoConsulta].oNome);        
                    System.out.println("Mes de contratacao: " + Constante.lista[codigoConsulta].oMesContratacao);     
                    System.out.println("Salario: R$ " + Constante.lista[codigoConsulta].oSalario);        
                    System.out.println("Materia: " + Constante.lista[codigoConsulta].aMateria);
                    System.out.println("Identificacao: " +  Constante.lista[codigoConsulta].aIdentificacao);
                    System.out.println(" ");
        	    }
    	    }else {
    	        Menus.informarCodigoInexistente();
    	    }    
	    }while (Menus.getOpcao() != 2);
	}
    
    public static void imprimirTodos() {
                  	    	
            	Aluno aluno = new Aluno();
    			aluno.imprimir();	
                    	
            	Professor professor = new Professor();
    			professor.imprimir();	

	}

    public static void main(String[] args){
			 
		do {
		    try {
				
		        Menus.menuPrincipal();
			        
    				switch (Menus.getOpcao()) { 
    				case 1: 
                            try {
                                registrarAluno();
                            } catch (NotaInvalidaException e) {
                               
                            }
    					break;
    				case 2: 
    				    registrarProfessor();
    					break;				
    				case 3: 
    				    
    				   // consultarSituacao();
    					for (int i = 0; i <Constante.lista.size(); i++) {
    						System.out.println(Constante.lista.get(i));
    					}
    					
    				    break;
    				case 4: 
    				    imprimirTodos();
    				    break;
    				case 5: 
    				    System.out.println("Processamento Finalizado!");
    				    break;
    				default:
    					Menus.opcaoInvalida();			
    				}
    				
			}catch (InputMismatchException exception1 ) {
			    System.err.println("a opcao precisa ser um numero de 1 a 5");
			} finally {
			    Menus.getIn().nextLine();   
			}
		}while(Menus.getOpcao() != 5);	
		
    
    } 
}
