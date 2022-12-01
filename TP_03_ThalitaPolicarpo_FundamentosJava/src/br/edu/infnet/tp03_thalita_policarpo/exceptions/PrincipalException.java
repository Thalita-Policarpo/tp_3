package br.edu.infnet.tp03_thalita_policarpo.exceptions;

public class PrincipalException extends Exception {

    public PrincipalException() {
        super();
    }
    
    public PrincipalException(String mensagem) {
        System.err.println(mensagem);
    }

}
