package br.edu.infnet.app.dominio;

public class Aluno extends Pessoa {
    private String disciplina;

	public Aluno() {
		
	}

	public Aluno(Integer codigoPessoa, String nome, String cpf, String disciplina) {
		super(codigoPessoa, nome,  cpf);
		this.disciplina = disciplina;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String pessoa = super.toString();
		sb.append("Aluno ");
		sb.append(pessoa);
		sb.append(" [disciplina=" + disciplina + "]");
		return sb.toString();
	}
    
    
}