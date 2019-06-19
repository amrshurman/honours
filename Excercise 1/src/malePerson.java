public class malePerson extends Person {
  public malePerson(Mediator m, String name) {
		super(m);
		this.name=name;
		// TODO Auto-generated constructor stub
	}

public void receive(Pizza P) {
    System.out.println(this.name + " has received his : " + P.name +" Pizza. ");
  }
}
