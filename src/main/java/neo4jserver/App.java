package neo4jserver;

import org.neo4j.driver.*;
import org.neo4j.driver.Record;
import org.neo4j.fabric.stream.StatementResult;
import neo4jserver.SearchService;
import static org.neo4j.driver.Values.parameters;



public class App
{
    public static void main( String[] args )
    {
//        SearchService searchService = new SearchService("bolt://localhost:7687","neo4j","wjlwch");
//
//        Driver driver = GraphDatabase.driver( "bolt://localhost:7687", AuthTokens.basic( "neo4j", "wjlwch" ) );
//        Session session = driver.session();
////        session.run( "CREATE (a:Person {name: $name, title: $title})",parameters( "name", "San Zhang", "title", "person" ) );
//        session.run( "MATCH (a:Person {name: $name1}),(b:Person {name: $name2}) create (a)-[r: hate]->(b) return r",parameters( "name1", "Jialin Wang", "name2", "San Zhang","relation", "hate" ) );
//
//        Result result = session.run( "MATCH (a:Person) WHERE a.name = 'Jialin Wang' " + "RETURN a.name AS name, a.title AS title",
//                parameters( "name", "Jialin Wang" ) );
//
//        while ( result.hasNext() )
//        {
//            Record record = result.next();
//            System.out.println( record.get( "title" ).asString() + " " + record.get( "name" ).asString() );
//        }
//        session.close();
//        driver.close();
        SearchService searchService = new SearchService("bolt://localhost:7687","neo4j","wjlwch");
        searchService.add_point();
        searchService.service_close();
    }
}