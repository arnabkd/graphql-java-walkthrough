package how.tographql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import java.util.List;

public class Query implements GraphQLRootResolver {
    private PersonRepository personRepository;
    public Query(){
        personRepository = new PersonRepository();
    }

    public List<Person> allPeople () {
        return personRepository.getAll();
    }
}
