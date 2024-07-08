package org.example.service;

import org.example.config.HibernateUtil;
import org.example.model.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlanetCrudService {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public Planet findById(String id) {
        try (Session session = sessionFactory.openSession()) {
            if (!id.equals("[A-Z,0-9]{1,255}")){
                throw new IllegalArgumentException();
            }
            return session.find(Planet.class, id);
        }
    }
    public String save(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            if (!planet.getId().equals("[A-Z,0-9]{1,255}")){
                throw new IllegalArgumentException();
            }
            session.persist(planet);
            tx.commit();
        }
        return planet.getId();
    }
    public void update(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            if (!planet.getId().equals("[A-Z,0-9]{1,255}")){
                throw new IllegalArgumentException();
            }
            session.merge(planet);
            tx.commit();
        }
    }
    public void delete(Long id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Planet planet = session.find(Planet.class, id);
            session.remove(planet);
            transaction.commit();
        }
    }
}
