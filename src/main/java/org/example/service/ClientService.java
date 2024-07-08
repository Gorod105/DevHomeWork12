package org.example.service;

import org.example.config.HibernateUtil;
import org.example.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ClientService {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public Client findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(Client.class, id);
        }
    }
}
