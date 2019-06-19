
public class pizzaStrategy1 implements Strategy{

	
	@Override
	public boolean order(Pizza p) {
		// TODO Auto-generated method stub
		
		//Vege pizza
		
		p.toppings.add("Mushrooms");
		p.toppings.add("Onions");
		p.toppings.add("Green Peppers");
		p.toppings.add("Black Olives");
		
		p.t.served.add(p);
		
		return true;
	}

}
