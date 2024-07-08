package org.example;

import org.example.config.FlywayConfig;
import org.example.service.ClientCrudService;
import org.example.service.PlanetCrudService;

public class Main {
    public static void main(String[] args) {
        FlywayConfig flywayConfig = new FlywayConfig();
        ClientCrudService clientService = new ClientCrudService();
        PlanetCrudService planetService = new PlanetCrudService();

    }
}