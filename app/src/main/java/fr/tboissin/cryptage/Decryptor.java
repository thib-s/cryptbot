package fr.tboissin.cryptage;

public class Decryptor {
	
	static int x;
	static StringBuilder sb;
	
	public static String decrypt(String toDecode, String key) throws InvalidKeyException{ 
		CryptUtils.checkKey(key);
		key = CryptUtils.makeKey(key, toDecode.length());
		sb = new StringBuilder();
		
		
		for (int i = 0; i < toDecode.length(); i++){
			x = ((int)toDecode.charAt(i) - (int)key.charAt(i));
			if (x<0){
				x += (126-32);
			}
			if (((int)toDecode.charAt(i) >= 32) && ((int)toDecode.charAt(i) <126)){
				if (x < (126-32)){
					sb.append((char)(x+32));
				}
				else{
					sb.append((char)(x%(126-32)+32));
				}
				
			}
			else{
				sb.append(toDecode.charAt(i));
			}
			
		}
		return sb.toString();
	}
}
