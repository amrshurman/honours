public class Menu implements WebsiteFunction {

   @Override
   public void accept(WebsiteFunctionVisitor WebsiteFunctionVisitor) {
	   WebsiteFunctionVisitor.visit(this);
   }
}