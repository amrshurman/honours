import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class mainClass {
	 public static String encrypt(String strClearText,String strKey) throws Exception{
		 SecretKeySpec key = new SecretKeySpec(strKey.getBytes("UTF-8"), "Blowfish");
	        Cipher cipher = Cipher.getInstance("Blowfish");
	        if ( cipher == null || key == null) {
	            throw new Exception("Invalid key or cypher");
	        }
	        cipher.init(Cipher.ENCRYPT_MODE, key);
	String encryptedData =new String(cipher.doFinal(strClearText.getBytes("UTF-8")));
	return encryptedData;
		}
	
	 public static boolean check(Pizza p) {
		 if (p.toppings.size()==0) {
			 return false;
		 }
		 else
		 return true;
	 }
	 
	public static void main(String [] args) throws Exception 
	{		
		  Scanner x = new Scanner(System.in);
		Table t = new Table();
		System.out.println("Would you like to order a vege pizza(1) or steak and peperoni pizza(2)?");
		Pizza p1 = new Pizza(new pizzaStrategy1(),"Large","Thin",t);
		Pizza p2 = new Pizza(new pizzaStrategy2(),"Large","Thin",t);
		  String input = x.nextLine();
		  if (input.equals("1")) {
			  System.out.println("What size do you want? Small(1) Large(2)?");
			  input = x.nextLine();
			  if (input.equals("1")) {
				  p1.size="Small";
			  }
			  else {
				  p1.size="Large";
			  }
			  System.out.println("What crust do you want? Thin(1) Thick(2)?");
			  input = x.nextLine();
			  if (input.equals("1")) {
				  p1.crust="Thin";
			  }
			  else {
				  p1.crust="Thick";
			  }
		t.toString(p1);
		  }
		  if (input.equals("2")) {
			  System.out.println("What size do you want? Small(1) Large(2)?");
			  input = x.nextLine();
			  if (input.equals("1")) {
				  p2.size="Small";
			  }
			  else {
				  p2.size="Large";
			  }
			  System.out.println("What crust do you want? Thin(1) Thick(2)?");
			  input = x.nextLine();
			  if (input.equals("1")) {
				  p2.crust="Thin";
			  }
			  else {
				  p2.crust="Thick";
			  }
		t.toString(p2);
		
		if (check(p2)==true) {
			System.out.println("CORRECT");
			System.out.println("What is your student ID?");
			  input = x.nextLine();
			  String stuNum = input;
			String s= encrypt("Completed",stuNum);
			System.out.println("Please copy and paste this text into a txt file and submit it on culearn");
			System.out.println(s);
		}
		else {
			System.out.println("Try again");
		}
		
		  }
		  
	}
}
