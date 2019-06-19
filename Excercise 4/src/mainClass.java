
public class mainClass {
		public static void main(String [] args) throws Exception {	
			CommandSetter CS= new CommandSetter();
			Oven o = new Oven();
			o.cookPizza();
			CS.setCommand(new
                    CookPizzaCommand(o)); 
			CS.buttonWasPressed();
		}
	}
