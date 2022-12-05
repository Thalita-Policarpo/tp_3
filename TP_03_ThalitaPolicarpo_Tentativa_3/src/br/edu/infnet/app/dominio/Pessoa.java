package br.edu.infnet.app.dominio;

import br.edu.infnet.app.exceptions.InvalidFillmentException;

public abstract class  Pessoa {
	private Integer codigoPessoa;
	
    private String nome;
    private String sobrenome;
    private String cpf;
   

	public Pessoa() {
       
    }


	public Pessoa(Integer codigoPessoa, String nome, String cpf) {
		this.codigoPessoa = codigoPessoa;
		this.nome = nome;
//		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}


	public Integer getCodigoPessoa() {
		return codigoPessoa;
	}


	public void setCodigoPessoa(Integer codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		if(nome == null) {
			throw new InvalidFillmentException("Preencha o nome corretamente");
		}
		
		int posicaoInicial = nome.indexOf(" ");
		int posicaoFinal = nome.length();
		
		if (posicaoInicial <0 || posicaoFinal <0) {
			throw new InvalidFillmentException("Preencha o nome corretamente");
		}
	
		this.nome = nome.substring(0, posicaoInicial);
		this.sobrenome = nome.substring(posicaoInicial,posicaoFinal).trim();
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "Pessoa [codigoPessoa=" + codigoPessoa + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cpf=" + cpf
				+ "]";
	}

	
   

}
