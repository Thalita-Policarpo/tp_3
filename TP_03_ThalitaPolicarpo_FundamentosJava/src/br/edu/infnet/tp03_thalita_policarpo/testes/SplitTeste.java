package br.edu.infnet.tp03_thalita_policarpo.testes;

public class SplitTeste {

    public static void main(String[] args) {
        StringBuilder sobrenome = new StringBuilder();

        String[] tokens = "Thalita Ferreira Policarpo Silva".split(" ");
        String nome = tokens[0];
        for(int i = 1; i < tokens.length-1; i++) {
            sobrenome.append(tokens[i]).append(" ");
        }
        String ultimoNome = tokens[tokens.length -1];    
        System.out.println(nome + " " + sobrenome.toString()  + ultimoNome);
        
    }
    
    
}
