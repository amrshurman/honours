	public class OvenHighCommand implements Command{
		   Oven oven; 
		   
		    public OvenHighCommand(Oven oven) 
		    { 
		       this.oven = oven; 
		    } 
		    public void execute() 
		    { 
		       oven.High(); 
		    } 
	}

