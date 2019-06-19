
public class mainClass {
	 public static void main(String[] args) {

	      WebsiteFunction website = new Website();
	      website.accept(new WebsiteDisplayVisitor());
	   }
}
//https://www.tutorialspoint.com/design_pattern/visitor_pattern.htm