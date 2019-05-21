/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatrice2;

/**
 *
 * @author adenis/Amir
 */
public class MonException extends Exception {
	private int code;
	private String defaultMessage;
	
	
	public MonException() {
		super();
	}
	public MonException(int code, String defaultMessage) {
		this.code = code;
		this.defaultMessage = defaultMessage;
	}
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getDefaultMessage() {
		return defaultMessage;
	}
	
	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}
}