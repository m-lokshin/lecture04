import org.flywaydb.core.Flyway;

public final class Main {
  public static void main(String[] args) {
    final Flyway flyway=Flyway.configure().dataSource("jdbc:postgresql://127.0.0.1:5435/test3","postgres","PgSQL10" )
        .locations("db")
        .load();
    flyway.clean();
    flyway.migrate();
    System.out.println("Hello world");
  }
}
