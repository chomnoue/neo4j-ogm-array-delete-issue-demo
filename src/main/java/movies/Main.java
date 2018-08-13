package movies;

import movies.domain.Actor;
import org.neo4j.ogm.config.Configuration;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Main {

  public static void main(String[] args) {
    Configuration configuration = new Configuration.Builder().build();
    SessionFactory sessionFactory = new SessionFactory(configuration, "movies.domain");
    Session session = sessionFactory.openSession();

    Actor actor1= new Actor();
    Actor actor2= new Actor();

    session.save(new Actor[]{actor1, actor2});

    session.delete(new Actor[]{actor1, actor2});
  }
}
