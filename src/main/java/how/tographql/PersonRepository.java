package how.tographql;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private final List<Person> people;

    public PersonRepository(){
        people = new ArrayList<Person>();
        people.add(new Person("Tom", 34));
        people.add(new Person("Jerry", 30));
        people.add(new Person("James", 29));
        people.add(new Person("Fred", 40));
    }

    public List<Person> getAll() {
        return people;
    }
}
