
public class Website implements WebsiteFunction{
	WebsiteFunction[] WebsiteFunctions;
	
	public Website(){
		WebsiteFunctions = new WebsiteFunction[] {new Menu(),new Order()};		
	   } 
	
	 @Override
	   public void accept(WebsiteFunctionVisitor WebsiteFunctionVisitor) {
	      for (int i = 0; i < WebsiteFunctions.length; i++) {
	    	  WebsiteFunctions[i].accept(WebsiteFunctionVisitor);
	      }
	      WebsiteFunctionVisitor.visit(this);
	   }
	 
}
