
public class CookPizzaCommand implements Command{
	   Oven oven; 
	   
	    public CookPizzaCommand(Oven oven)
	    { 
	    	this.oven= oven;
	    } 
	    public void execute() 
	    { 
	       oven.on();
	       oven.High(); 
	       oven.Timer(10);
	       oven.Low();
	       oven.Timer(5);
	       oven.off();	     
	       System.out.println("Pizza cooked!");
	    } 
}
