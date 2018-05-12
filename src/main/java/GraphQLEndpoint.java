import com.coxautodev.graphql.tools.SchemaParser;
import javax.servlet.annotation.WebServlet;
import graphql.servlet.SimpleGraphQLServlet;
import how.tographql.Query;


@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(SchemaParser.newParser()
                .file("schema.graphqls") //parse the schema file created earlier
                .resolvers(new Query())
                .build()
                .makeExecutableSchema());
    }
}