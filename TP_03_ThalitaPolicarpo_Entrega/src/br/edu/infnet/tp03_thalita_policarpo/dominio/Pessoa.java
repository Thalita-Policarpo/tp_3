package br.edu.infnet.tp03_thalita_policarpo.dominio;


public class  Pessoa {
	private static int codigoPessoa;
	private static StringBuilder nomeCompleto = new StringBuilder();
    private static String nome;
    private static String sobreNome;
    private static String ultimoNome;
    private static String cargo;
    private static int identificacao;
    

   

	public Pessoa() {
       
    }

    public Pessoa(String nome, String cargo, int aIdentificacao) {
        this.nome = nome;
        this.cargo = cargo;
        this.identificacao = aIdentificacao;
        
        String[] tokens = this.nome.split(" ");
        this.nome = tokens[0];
        this.sobreNome = tokens[1-(tokens.length -2)];
        this.ultimoNome = tokens[tokens.length -1];      
        
        this.nomeCompleto.append(this.nome).append(this.sobreNome).append(this.ultimoNome);
    }
    
    
    @Override
    public String toString() {
        return "nome: " + nome + "cargo: " + cargo + "identificacao: " + identificacao;
    }
    
    
    public void imprimir() {}
    
    
    // -----------------------------------------------------------------------
    
    // get -set identificacao
    public static int getIdentificacao() {
        return identificacao;
    }

    public static void setIdentificacao(int identificacao) {
        Pessoa.identificacao = identificacao;
    }
    
    public static int getCodigoPessoa() {
		return codigoPessoa;
	}

	public static void setCodigoPessoa(int codigoPessoa) {
		Pessoa.codigoPessoa = codigoPessoa;
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Pessoa.nome = nome;
	}

	public static String getCargo() {
		return cargo;
	}

	public static void setCargo(String cargo) {
		Pessoa.cargo = cargo;
	}

}
