package org.example.service;

import org.example.config.HibernateUtil;
import org.example.model.Client;
import org.example.model.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TicketCrudService {
    private final SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    public Ticket findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.find(Ticket.class, id);
        }
    }
    public Long save(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.persist(ticket);
            tx.commit();
        }
        return ticket.getId();
    }
    public void update(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.merge(ticket);
            tx.commit();
        }
    }
    public void delete(Long id) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Ticket ticket = session.find(Ticket.class, id);
            session.remove(ticket);
            transaction.commit();
        }
    }
}
