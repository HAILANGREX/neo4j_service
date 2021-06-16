package neo4jserver;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.driver.Session;

import javax.annotation.Resource;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.neo4j.driver.Values.parameters;

public class SearchService {

    private Driver driver;
    private Session session;

    public SearchService(String url,String username,String password){
        driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "wjlwch" ) );
        session = driver.session();
    }

    public void add_point(){
        session.run( "CREATE (a:Person {name: $name, title: $title})",parameters( "name", "San Zhang", "title", "person" ) );
    }

    public void service_close(){
        session.close();
        driver.close();
    }


}
