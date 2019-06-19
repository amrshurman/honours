
public class femalePerson extends Person {
  public femalePerson(Mediator m, String name) {
		super(m);
		this.name=name;
		// TODO Auto-generated constructor stub
	}

public void receive(Pizza P) {
    System.out.println(this.name + " has received her: " + P.name +" Pizza. ");
  }
}
