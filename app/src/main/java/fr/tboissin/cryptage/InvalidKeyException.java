package fr.tboissin.cryptage;

public class InvalidKeyException extends Exception {
	
	private static final String message = "La cl� entr�e est invalide";
	
	public String getMessage(){
		return message;
	}

}
