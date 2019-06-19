
public class WebsiteDisplayVisitor implements WebsiteFunctionVisitor{
	  @Override
	  public void visit(Website website) {
	      System.out.println("Displaying website.");
	   }
	   public void visit(Menu menu) {
	      System.out.println("Displaying menu.");
	   }
	   public void visit(Order order) {
		      System.out.println("Displaying order page.");
		   }

}
