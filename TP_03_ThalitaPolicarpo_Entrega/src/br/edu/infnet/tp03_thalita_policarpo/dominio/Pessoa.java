package br.edu.infnet.tp03_thalita_policarpo.dominio;


public class  Pessoa {
	private static int codigoPessoa;
	private static StringBuilder nomeCompleto = new StringBuilder();
    private static String nome;
    private static StringBuilder sobrenome = new StringBuilder();
    private static String ultimoNome;
    private static String cargo;
    private static int identificacao;
   

	public Pessoa() {
       
    }

    public Pessoa(String nome, String cargo, int aIdentificacao) {
        Pessoa.nome = nome;
        this.cargo = cargo;
        this.identificacao = aIdentificacao;
        
        
        String[] tokens = this.nome.split(" ");
        this.nome = tokens[0];
        
        for(int i = 1; i < tokens.length-1; i++) {
        	this.sobrenome.append(tokens[i]).append(" ");
        }
        
        this.ultimoNome = tokens[tokens.length -1];    
        this.nomeCompleto.append(this.nome).append(" ").append(this.sobrenome).append(this.ultimoNome);
    }
    
    
    @Override
    public String toString() {
        return "nome: " + nome + "cargo: " + cargo + "identificacao: " + identificacao;
    }
    
    
    public void imprimir() {}
    
    
    //  get -set --------------------------------------------------------------------
    
 // identificacao
    public static int getIdentificacao() {
        return identificacao;
    }

    public static void setIdentificacao(int identificacao) {
        Pessoa.identificacao = identificacao;
    }
    
// codigoPessoa
    public static int getCodigoPessoa() {
		return codigoPessoa;
	}

	public static void setCodigoPessoa(int codigoPessoa) {
		Pessoa.codigoPessoa = codigoPessoa;
	}

//	nome
	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}

//	cargo
	public static String getCargo() {
		return cargo;
	}

	public static void setCargo(String cargo) {
		Pessoa.cargo = cargo;
	}

//	nomeCompleto
	public static StringBuilder getNomeCompleto() {
		return nomeCompleto;
	}

	public static void setNomeCompleto(StringBuilder nomeCompleto) {
		Pessoa.nomeCompleto = nomeCompleto;
	}

//	sobrenome
	public static StringBuilder getSobrenome() {
		return sobrenome;
	}

	public static void setSobrenome(StringBuilder sobreNome) {
		Pessoa.sobrenome = sobreNome;
	}

//	ultimoNome
	public static String getUltimoNome() {
		return ultimoNome;
	}

	public static void setUltimoNome(String ultimoNome) {
		Pessoa.ultimoNome = ultimoNome;
	}

}
