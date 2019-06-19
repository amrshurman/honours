
public class Oven {
	public int time;
	 public void on() 
	    { 
	        System.out.println("The oven is on"); 
	    } 
	    public void off() 
	    { 
	        System.out.println("The oven is off"); 
	    } 
	    public void Low() 
	    { 
	        System.out.println("The oven is on low"); 
	    } 
	    public void High() 
	    { 
	        System.out.println("The oven is on high"); 
	    } 
	    public void Timer(int i) 
	    { 
	        System.out.println("The oven has been set to " + i + " minutes."); 
	    } 
	    public void cookPizza() {
	    	System.out.println("Cooking Pizza in progress..."); 
	    }
}
