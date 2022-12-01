package br.edu.infnet.tp03_thalita_policarpo.dominio;


public class Professor extends Pessoa {
	private static String materia;
	private static float salario;
	private static String mesContratacao;

	
	public Professor(){}
	
	public Professor(String oNome, String cargoProfessor, int aIdentificacao, String aMateria, float oSalario, String oMesContratacao){
	    super(oNome, cargoProfessor, aIdentificacao);
	    this.materia = aMateria;
	    this.salario = oSalario;
	    this.mesContratacao = oMesContratacao;
	}
	
	public void imprimirProfessor(String oNome, String cargoProfessor, int aIdentificacao, String aMateria, float oSalario, String oMesContratacao) {
	    
	    System.out.println("Nome do profesor: " + oNome);        
        System.out.println("Mes de contratacao: " + oMesContratacao);     
        System.out.println("Salario: R$ " + oSalario);        
        System.out.println("Materia: " + aMateria);
        System.out.println("Identificacao: " +  aIdentificacao);
        System.out.println(" ");
	}
	
	@Override
	public String toString() {
	    return super.toString() +"Mes de contratacao: " + mesContratacao + "Materia: " + materia + "Salario: R$" + salario;
	}
}