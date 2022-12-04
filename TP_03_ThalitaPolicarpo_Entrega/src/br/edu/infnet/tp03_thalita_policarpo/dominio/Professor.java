package br.edu.infnet.tp03_thalita_policarpo.dominio;

import br.edu.infnet.tp03_thalita_policarpo.auxiliar.Constante;

public class Professor extends Pessoa {
	private static String materia;
	private static float salario;
	private static String mesContratacao;

	
	public Professor(){}
	
	public Professor(String oNome, String cargoProfessor, int aIdentificacao, String aMateria, float oSalario, String oMesContratacao){
	    super(oNome, cargoProfessor, aIdentificacao);
	    Professor.materia = aMateria;
	    Professor.salario = oSalario;
	    Professor.mesContratacao = oMesContratacao;
	}
	
	@Override
	public void imprimir() {
		for (int i = 0; i <Constante.lista.size(); i++) {
		    if(Constante.lista.get(i).getCargo() == "professor") {
		    	System.out.println("Nome do profesor: " + oNome);        
		    	System.out.println("Mes de contratacao: " + oMesContratacao);     
		    	System.out.println("Salario: R$ " + oSalario);        
		    	System.out.println("Materia: " + aMateria);
		    	System.out.println("Identificacao: " +  aIdentificacao);
		    	System.out.println(" ");
		    }	
	    }
	}
	
	
	@Override
	public String toString() {
	    return super.toString() +"Mes de contratacao: " + mesContratacao + "Materia: " + materia + "Salario: R$" + salario;
	}

	public static String getMateria() {
		return materia;
	}

	public static void setMateria(String materia) {
		Professor.materia = materia;
	}

	public static float getSalario() {
		return salario;
	}

	public static void setSalario(float salario) {
		Professor.salario = salario;
	}

	public static String getMesContratacao() {
		return mesContratacao;
	}

	public static void setMesContratacao(String mesContratacao) {
		Professor.mesContratacao = mesContratacao;
	}
	
	
}