package fr.tboissin.cryptage;

public class CryptUtils {
	
	protected static final String makeKey(String key, int length){
		while (key.length()<length){
			key += key;
		}
		return key;
	}
	
	protected static final void checkKey(String key) throws InvalidKeyException{
		if (key.length() == 0){throw new InvalidKeyException();}
		int x = 0;
		for (int i=0; i < key.length(); i++){
			x = (int)key.charAt(i);
			if (x<32 || x>126){throw new InvalidKeyException();}
		}		
	}
}
