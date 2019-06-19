import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Observable;

public class Pizza {
	
	Table t;
private Strategy Strategy;
public String size;
public String crust;
public ArrayList<String> toppings=new ArrayList<String>();

public Pizza(Strategy s,String size,String crust,Table t) {
	this.Strategy =s;
	this.size=size;
	this.crust=crust;
	this.t=t;
	Strategy.order(this);

}

}
