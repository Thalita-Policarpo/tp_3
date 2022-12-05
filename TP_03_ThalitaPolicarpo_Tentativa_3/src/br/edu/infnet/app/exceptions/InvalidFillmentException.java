package br.edu.infnet.app.exceptions;

public class InvalidFillmentException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidFillmentException (String msg) {
		super(msg);
	}

}
