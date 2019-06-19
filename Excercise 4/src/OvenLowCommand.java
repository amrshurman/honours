
	public class OvenLowCommand implements Command{
		   Oven oven; 
		   
		    public OvenLowCommand(Oven oven) 
		    { 
		       this.oven = oven; 
		    } 
		    public void execute() 
		    { 
		       oven.Low(); 
		    } 
	}


