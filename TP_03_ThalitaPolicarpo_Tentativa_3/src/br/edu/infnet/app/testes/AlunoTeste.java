package br.edu.infnet.app.testes;

import br.edu.infnet.app.dominio.Aluno;

public class AlunoTeste {
	public static void main(String[] args) {
		Aluno aluno = new Aluno(01, "oNome Osobrenome", "cpf", "aDisciplina");
		System.out.println(aluno.toString());
	}
	
	
	
	
}
