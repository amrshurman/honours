import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Decrypt {
	
	 public static String decrypt(String strEncrypted,String strKey) throws Exception{
		  SecretKeySpec key = new SecretKeySpec(strKey.getBytes("UTF-8"), "Blowfish");
	         Cipher cipher = Cipher.getInstance("Blowfish");
	         cipher.init(Cipher.DECRYPT_MODE, key);
	         byte[] decrypted = cipher.doFinal(strEncrypted.getBytes());
	         return new String(decrypted);
	 }
	
	public static void main(String [] args) throws Exception 
	{	
		System.out.println(decrypt("ÏôœS¶A)J}CØæ„ê&","100996742"));
	}
}
