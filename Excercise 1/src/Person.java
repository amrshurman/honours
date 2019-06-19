
public abstract class Person{
  private Mediator mediator;
  public String name="";
  
  public Person(String n) {
	  name=n;
  }
  public Person(Mediator m) {
    mediator = m;
  }
  
  public void Deliver(Pizza p) {
    mediator.Deliver(p, this);
  }
  //get access to the mediator
  public Mediator getMediator() {return mediator;}
  public abstract void receive(Pizza p);
}

//https://dzone.com/articles/design-patterns-mediator