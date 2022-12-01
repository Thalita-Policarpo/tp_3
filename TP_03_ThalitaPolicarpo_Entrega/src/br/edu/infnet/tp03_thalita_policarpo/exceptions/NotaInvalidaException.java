package br.edu.infnet.tp03_thalita_policarpo.exceptions;

public class NotaInvalidaException extends PrincipalException {

    
    public NotaInvalidaException() {
        super("A nota deve ser um numero entre 0 e 10");
    }
    
}
