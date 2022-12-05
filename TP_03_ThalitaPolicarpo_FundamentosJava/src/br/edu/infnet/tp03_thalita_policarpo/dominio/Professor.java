package br.edu.infnet.tp03_thalita_policarpo.dominio;

import java.util.InputMismatchException;
import java.util.Scanner;
import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;
import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Menus;

public class Professor extends Pessoa {
    private static Professor[] professor = new Professor[Constante.TAMANHO];
	private static Scanner in = new Scanner(System.in);
	private int opcao = 0;
    private int codigoProfessor = 0;
    private String materia;
    private float salario;
    private String mesContratacao;

	
	public Professor(){}
	
	
	
	
	public Professor(StringBuilder nomeCompleto, String nome, StringBuilder sobreNome, String ultimoNome, String cargo,
            int identificacao, int codigoProfessor, String materia, float salario, String mesContratacao) {
        super(nomeCompleto, nome, sobreNome, ultimoNome, cargo, identificacao);
        this.codigoProfessor = codigoProfessor;
        this.materia = materia;
        this.salario = salario;
        this.mesContratacao = mesContratacao;
    }


	
	@Override
    public String toString() {
        return super.toString() 
                +"\n Materia: " + materia
                +"\n Salario: R$" + salario 
                +"\n Mes de contratacao: " + mesContratacao;
    }


    @Override
	public void registrar() {
	    

		try {			
			if(codigoProfessor >= Constante.TAMANHO) {
								
				Menus.informarLimiteDeCadastro();
				 
			}else {
			    professor[codigoProfessor] = new Professor();
			   
			    
			    professor[codigoProfessor].setCargo("Professor");
			    professor[codigoProfessor].setIdentificacao(codigoProfessor);
				in.nextLine();
				
				System.out.println("Informe o nome do professor:");
				professor[codigoProfessor].setNome(in.nextLine());
				
				System.out.println("Informe o mes de contratacao:");
				professor[codigoProfessor].setMesContratacao(in.next());
				
				System.out.println("Informe o salario:");
				professor[codigoProfessor].setSalario(in.nextFloat());
				
				System.out.println("Informe a materia:");
				professor[codigoProfessor].setMateria(in.next());

				System.out.println("Professor cadastrado com sucesso!");	
				System.out.println("codigo de consulta: " + codigoProfessor + "\n");
				
				codigoProfessor++;
				
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
    						
    			if("professor".equalsIgnoreCase(professor[codigoConsulta].getCargo()) && codigoConsulta >=0 && codigoConsulta < codigoProfessor ) {
    			    System.out.println(professor[codigoConsulta]);
    				
    				Menus.perguntarNovaConsulta();
    				
    			}else {
    				Menus.informarCodigoInexistente();
    			}
		    }catch (NullPointerException exception1){
                System.err.println("ainda nao ha professores cadastrados!");
                   
            }
		}while (opcao != 2);
	}
	
	@Override
	public void consultarTodos() {
	    try {
    		for (int i = 0; i < codigoProfessor; i++) {
    			if("professor".equalsIgnoreCase(professor[i].getCargo()) ) {
    			    System.out.println(professor[i]);
    			}
    		}	
	    }catch (NullPointerException exception2){
            System.err.println("ainda nao ha professores cadastrados!");                      
        }
	}
	
	@Override
	public void executar() {
			Menus.menuProfessor();
			
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
				Menus.opcaoInvalida();
				break;				
			}
	}




    public static Professor[] getProfessor() {
        return professor;
    }




    public static void setProfessor(Professor[] professor) {
        Professor.professor = professor;
    }




    public int getCodigoProfessor() {
        return codigoProfessor;
    }




    public void setCodigoProfessor(int codigoProfessor) {
        this.codigoProfessor = codigoProfessor;
    }




    public String getMateria() {
        return materia;
    }




    public void setMateria(String materia) {
        this.materia = materia;
    }




    public float getSalario() {
        return salario;
    }




    public void setSalario(float salario) {
        this.salario = salario;
    }




    public String getMesContratacao() {
        return mesContratacao;
    }




    public void setMesContratacao(String mesContratacao) {
        this.mesContratacao = mesContratacao;
    }

	
	
	
}