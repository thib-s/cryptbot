package fr.tboissin.cryptage;

public class Cryptor {
	
	static int x;
	static StringBuilder sb;
	
	public static String crypt(String toEncode, String key) throws InvalidKeyException{ 
		CryptUtils.checkKey(key);
		key = CryptUtils.makeKey(key, toEncode.length());
		sb = new StringBuilder();
		
		for (int i = 0; i < toEncode.length(); i++){
			x = ((int)toEncode.charAt(i) + (int)key.charAt(i)) - (32 * 2);
			
			if (((int)toEncode.charAt(i) >= 32) && ((int)toEncode.charAt(i) <126)){
				if (x > 126-32){
					sb.append((char)(x%(126-32)+32));
				}
				else{
					sb.append((char)(x+32));
				}
				
			}
			else{
				sb.append(toEncode.charAt(i));
			}
			
		}
		return sb.toString();
	}

}
