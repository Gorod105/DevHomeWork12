package org.example.config;

import org.flywaydb.core.Flyway;

public class FlywayConfig {
    public FlywayConfig() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5437/dev-homework-12", "postgres", "password")
                .locations("db/migrations")
                .load();
        flyway.migrate();
    }
}
