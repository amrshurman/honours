import java.util.Observable;

public class PizzaPizza extends Observable {
    private String pizzaName;
    private String customerName;
    private Order order;
 
    public void setOrder(Order order) {
        this.pizzaName = order.Pizza;
        this.customerName = order.Customer;
        setChanged();
        notifyObservers(order);
        
    }
    
    public String getOrder()
    {
        return pizzaName;
    }
    public PizzaPizza(Order o)
    {
           this.order=o;
    }
}

