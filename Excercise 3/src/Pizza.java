import java.util.Observable;
import java.util.Observer;

public class Pizza implements Observer{
	  private String name;
	  private String cName;
	  private PizzaPizza pp;
	  private Order order;
	  
	  @Override
	    public void update(Observable o, Object or) {
	      pp = (PizzaPizza) o;
	      order = (Order) or;
	      System.out.println(order.Pizza + " has been ordered for " + order.Customer);
	    }

	   public static void main(String[] args)
	    {
	            PizzaPizza observable = new PizzaPizza(null);
	            Pizza observer = new Pizza();
	            Order Order1 = new Order("Vege Pizza", "John");
	            Order Order2 = new Order("Peperoni Pizza", "Sarah");
	            observable.addObserver(observer);
	            observable.setOrder(Order1);
	            observable.setOrder(Order2);
	    }
	
	
}