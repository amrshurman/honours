
public class Client {
  public static void main(String[] args) {
	 
    applicationMediator mediator = new applicationMediator();
    malePerson Jack = new malePerson(mediator,"jack");
    femalePerson Sarah = new femalePerson(mediator,"Sarah");
    mediator.addPerson(Jack);
    mediator.addPerson(Sarah);
    Jack.Deliver(new Pizza("Vege"));
    Sarah.Deliver(new Pizza("Meat"));
  }
}