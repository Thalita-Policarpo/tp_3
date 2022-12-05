package br.edu.infnet.app.exceptions;

public class NotaInvalidaException extends PrincipalException {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotaInvalidaException() {
        super("A nota deve ser um numero entre 0 e 10");
    }
    
}
