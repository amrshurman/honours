public class Order implements WebsiteFunction {

   @Override
   public void accept(WebsiteFunctionVisitor WebsiteFunctionVisitor) {
	   WebsiteFunctionVisitor.visit(this);
   }
}