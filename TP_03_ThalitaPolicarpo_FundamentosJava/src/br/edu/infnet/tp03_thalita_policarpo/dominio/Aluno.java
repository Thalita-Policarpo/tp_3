package br.edu.infnet.tp03_thalita_policarpo.dominio;

import java.util.InputMismatchException;
import java.util.Scanner;
import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;
import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Menus;
import br.edu.infnet.tp03_thalita_policarpo.exceptions.NotaInvalidaException;

public class Aluno extends Pessoa {
    private static Aluno[] aluno= new Aluno[Constante.TAMANHO];
	private static Scanner in = new Scanner(System.in);
	private int opcao = 0;
    private int codigoAluno = 0;
	private float av1;
    private float av2;
    private float media;
    private String status;
    
	
	public Aluno() {}

    public Aluno(StringBuilder nomeCompleto, String nome, StringBuilder sobreNome, String ultimoNome, String cargo,
            int identificacao, int codigoAluno, float av1, float av2) {
        super(nomeCompleto, nome, sobreNome, ultimoNome, cargo, identificacao);
        this.codigoAluno = codigoAluno;
        this.av1 = av1;
        this.av2 = av2;
    }
    

    @Override
    public String toString() {
        this.media = media(av1, av2);
        this.status = status(this.media);
        return super.toString() 
                +"\n Nota da Avaliacao 1= " + av1 
                +"\n Nota da Avaliacao 2= " + av2 
                +"\n Media: " + media
                +"\n Status: " + status;
    }

    public void registrar() throws NotaInvalidaException  {
	    
	    try {
			if(codigoAluno >= Constante.TAMANHO) {
								
				Menus.informarLimiteDeCadastro();
				
			}else {
			    aluno[codigoAluno] = new Aluno();
			    
			    
			    aluno[codigoAluno].setCargo("Aluno");
			    aluno[codigoAluno].setIdentificacao(codigoAluno);
				in.nextLine();
				
				System.out.println("Informe o nome do aluno:");
				aluno[codigoAluno].setNome(in.nextLine());

			    System.out.println("Informe a nota da Avaliacao 1:");
			    aluno[codigoAluno].setAv1(in.nextFloat());

			    if (aluno[codigoAluno].getAv1() < 0 || aluno[codigoAluno].getAv1() > 10 ) {
			        throw new NotaInvalidaException();
			    }

			    System.out.println("Informe a nota da Avaliacao 2:");
			    aluno[codigoAluno].setAv2(in.nextFloat());


				if ( aluno[codigoAluno].getAv2() < 0 || aluno[codigoAluno].getAv2()  > 10) {
				    throw new NotaInvalidaException();
				}
				 

				System.out.println("Aluno cadastrado com sucesso!");	
				System.out.println("codigo de consulta: " + codigoAluno + "\n");	
				
						    	
				codigoAluno++;
		    }			
	    }catch (InputMismatchException exception ) {
	        System.err.println("A nota precisa ser um numero!");  
	        
	    }finally {
            in.nextLine();   
        }
	}




    private static float media(float nota1, float nota2) {
		return (nota1+ nota2) / 2;
	}
	
	private static String status(float aMedia) {
				
		if(aMedia >= 4 && aMedia < 7) {
			return "Prova final";			
		}else if (aMedia >= 7) {
			return "Aprovado";
		}
		return "Reprovado";
	}
	
	@Override
	public  void consultarUm() {
				
		do {
		    try {
    			System.out.println("Informe o codigo de consulta:");
    			int codigoConsulta = in.nextInt();
    						
    			if("aluno".equalsIgnoreCase(aluno[codigoConsulta].getCargo()) && codigoConsulta >=0 && codigoConsulta < codigoAluno) {
    				System.out.println(aluno[codigoConsulta]);
    				
    				Menus.perguntarNovaConsulta();
    				opcao = in.nextInt();
    				
    			}else {
    				Menus.informarCodigoInexistente();
    			}
		    }catch (NullPointerException exception1){
		        System.err.println("ainda nao ha alunos cadastrados!");   		        
		    }
		}while (opcao != 2);		
	}
	
	@Override
	public void consultarTodos() {
	    try {
    		for (int i = 0; i < codigoAluno; i++) {
    			if("aluno".equalsIgnoreCase(aluno[i].getCargo()) ){
    			    System.out.println(aluno[i]);
    			}
    		}
	    }catch (NullPointerException exception2){
            System.err.println("ainda nao ha alunos cadastrados!");
                            
        }
	}
		
	
	public void executar() {
	   
			Menus.menuAluno();
			
			System.out.println("Esolha uma opcao: ");
			opcao = in.nextInt();

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
				Menus.opcaoInvalida();
				break;				
			}	
	    
	}

    public static Aluno[] getAluno() {
        return aluno;
    }

    public static void setAluno(Aluno[] aluno) {
        Aluno.aluno = aluno;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public float getAv1() {
        return av1;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public float getAv2() {
        return av2;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
 
}