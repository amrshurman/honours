import java.util.ArrayList;

public class applicationMediator implements Mediator {
  private ArrayList<Person> Persons;
  public applicationMediator() {
    Persons = new ArrayList<Person>();
  }
  public void addPerson(Person per) {
    Persons.add(per);
  }
  public void Deliver(Pizza p, Person per) {
    //let all other screens know that this screen has changed
    for(Person person: Persons) {
      //don't tell ourselves
      if(person != per) {
        person.receive(p);
      }
    }
  }
}
