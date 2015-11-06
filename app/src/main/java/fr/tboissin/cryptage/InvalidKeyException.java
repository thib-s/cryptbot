package fr.tboissin.cryptage;

public class InvalidKeyException extends Exception {
	
	private static final String message = "La clé entrée est invalide";
	
	public String getMessage(){
		return message;
	}

}
