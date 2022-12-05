package br.edu.infnet.tp03_thalita_policarpo.dominio;

import br.edu.infnet.tp03_thalita_policarpo.exceptions.PrincipalException;

public abstract class Pessoa {
	private StringBuilder nomeCompleto = new StringBuilder();
	private String nome;
	private StringBuilder sobreNome = new StringBuilder();
	private String ultimoNome;
	private String cargo;
	private int identificacao;


	
	public Pessoa() {} 
	
    public Pessoa(StringBuilder nomeCompleto, String nome, StringBuilder sobreNome, String ultimoNome, String cargo,
            int identificacao) {
        super();
        this.nomeCompleto = nomeCompleto;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.ultimoNome = ultimoNome;
        this.cargo = cargo;
        this.identificacao = identificacao;
    }

    
    @Override
    public String toString() {
        return  cargo 
           +"\n Codigo de consulta: " + identificacao 
           +"\n Nome: " + nomeCompleto ;
    }

	
	public void executar() throws PrincipalException {}
	
	public void registrar() throws PrincipalException{}
	
	public void consultarUm() {}

	public void consultarTodos() {}

    public StringBuilder getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(StringBuilder nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String[] tokens = nome.split(" ");
        this.nome = tokens[0];
        
        for(int i = 1; i < tokens.length-1; i++) {
            setSobreNome(getSobreNome().append(tokens[i]).append(" "));
        }
        setUltimoNome(tokens[tokens.length -1]);   
        setNomeCompleto(getNomeCompleto()
                .append(getNome())
                .append(" ")
                .append(getSobreNome())
                .append(getUltimoNome()));
        this.nome = nome;
    }

    public StringBuilder getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(StringBuilder sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }


	  	
}
