package br.edu.infnet.app.exceptions;

public class PrincipalException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PrincipalException() {
        super();
    }
    
    public PrincipalException(String mensagem) {
        System.err.println(mensagem);
    }

}
