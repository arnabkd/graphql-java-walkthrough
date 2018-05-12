package how.tographql;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private final List<Person> people;

    public PersonRepository(){
        people = new ArrayList<Person>();
        people.add(new Person("Tom", "Cat",34));
        people.add(new Person("Jerry", "Mouse",30));
        people.add(new Person("James", "Jameson", 29));
        people.add(new Person("Fred", "Fredson", 40));
    }

    public List<Person> getAll() {
        return people;
    }
}
