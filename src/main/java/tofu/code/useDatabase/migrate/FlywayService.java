package tofu.code.useDatabase.migrate;

import org.flywaydb.core.Flyway;

public class FlywayService {

    Flyway flyway;

    public void migrateFlyway(){
        flyway.configure();
        flyway.migrate();
    }


}
