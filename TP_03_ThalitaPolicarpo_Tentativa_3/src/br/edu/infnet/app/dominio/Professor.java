package br.edu.infnet.app.dominio;

public class Professor extends Pessoa {
	private String materia;
	private double salario;
	
	public Professor() {
	
	}

	public Professor(Integer codigoPessoa, String nome, String cpf, String aMateria, double oSalario) {
		super(codigoPessoa, nome,  cpf);
		this.materia = aMateria;
		this.salario = oSalario;
		
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		String professor = "Professor :" + getCodigoPessoa() + " - " + getNome() + " " + getSobrenome() +
				" com CPF Nº: " + getCpf() + " especialista em " + getMateria() + " com o salario de R$ "
				+ getSalario();
		return professor;
	}
	
	
	
}