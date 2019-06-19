
public class TimerCommand implements Command{
	   Oven oven; 
	   
	    public TimerCommand(int i)
	    { 
	    	this.oven.time=i;
	    } 
	    public void execute() 
	    { 
	       oven.High(); 
	    } 
}
