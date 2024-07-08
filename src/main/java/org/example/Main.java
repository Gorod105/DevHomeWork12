package org.example;

import org.example.config.FlywayConfig;
import org.example.service.ClientService;

public class Main {
    public static void main(String[] args) {
        FlywayConfig flywayConfig = new FlywayConfig();
        ClientService clientService = new ClientService();
        System.out.println(clientService.findById(1L));
    }
}