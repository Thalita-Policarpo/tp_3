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
	    
//	    String[] tokens = getNome().split(" ");
//        Professor.setNome(tokens[0]);
//        
//        for(int i = 1; i < tokens.length-1; i++) {
//        	Professor.setSobrenome(getSobrenome().append(tokens[i]).append(" "));
//        }
//        
//       Professor.setUltimoNome(tokens[tokens.length -1]);   
//       Professor.setNomeCompleto(getNomeCompleto().append(Professor.getNome()).append(" ").append(Professor.getSobrenome()).append(Professor.getUltimoNome()));
       
       
	}
	
	@Override
	public void imprimir() {
		for (int i = 0; i <Constante.lista.size(); i++) {
		    if(Constante.lista.get(i).cargo == "professor") {
		    	System.out.println( "Nome do profesor: " + oNome 
		    					+"\n Mes de contratacao: " + oMesContratacao 
		    					+"\n Salario: R$ " + oSalario 
		    					+"\n Materia: " + aMateria 
		    					+"\n Identificacao: " +  aIdentificacao 
		    					+"\n");
		    }	
	    }
	}
	
	
	@Override
	public String toString() {
	    return super.toString() +"\nMes de contratacao: " + mesContratacao + "\nMateria: " + materia + "\nSalario: R$" + salario +"\n";
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