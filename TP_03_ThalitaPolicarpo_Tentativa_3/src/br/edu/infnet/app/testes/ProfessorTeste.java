package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Professor;

public class ProfessorTeste {
	public static void main(String[] args) {
		Professor professor = new Professor();
		
		professor.setCodigoPessoa(1);
		professor.setNome("Thalita Policarpo");
		professor.setCpf("123456789-00");
		professor.setMateria("java");
		professor.setSalario(10000.00);
		
		System.out.println(professor.toString());
		
		
	}
}
