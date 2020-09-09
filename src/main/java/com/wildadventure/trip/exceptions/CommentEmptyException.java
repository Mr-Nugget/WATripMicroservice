/**
 * 
 */
package com.wildadventure.trip.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author t_rai
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class CommentEmptyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CommentEmptyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentEmptyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
