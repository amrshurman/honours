import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
public class Table {

	public ArrayList<Pizza> served = new ArrayList<Pizza>();
	
	public String toString(Pizza p) {
		if (p.toppings.size()==0) {
			System.out.println("Not enough toppings found on Pizza");
			return "Not enough toppings found on Pizza";
		}
		else {
			String s="The pizza ordered is a " + p.size + " " + p.crust + " crusted pizza with the toppings: ";
			for (int i=0;i<p.toppings.size();i++) {
		s += p.toppings.get(i);
			}
		System.out.println(s);
		return s;
		}
		}
	
	
}
