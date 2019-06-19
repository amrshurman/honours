
public class pizzaStrategy2 implements Strategy{

	@Override
	public boolean order(Pizza p) {
		// TODO Auto-generated method stub
		
		//Vege pizza
		
	//	p.toppings.add("Peperoni");
	//	p.toppings.add("Steak");
	//	p.toppings.add("Green Peppers");
		p.toppings.add("Black Olives");
		
		p.t.served.add(p);
		
		return true;
}

}