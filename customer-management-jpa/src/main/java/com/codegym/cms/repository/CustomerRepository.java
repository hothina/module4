package com.codegym.cms.repository;

import com.codegym.cms.model.Customer;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class CustomerRepository implements ICustomerRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Customer> searchByAll(String keySearch) {
        TypedQuery<Customer> query ;

        if (Long.parseLong(keySearch)>0) {
            Long k = Long.parseLong(keySearch);
            query = em.createQuery("select c from Customer c where  c.id = :k ", Customer.class);
            query.setParameter("k",k);
        } else {
            query = em.createQuery("select c from Customer c where  c.firstName = :keySearch ", Customer.class);
            query.setParameter("keySearch",keySearch);
        }

        return query.getResultList();
    }

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(Long id) {
        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=?1", Customer.class);
        query.setParameter(1, id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Customer customer) {
        if (customer.getId() != null) {
            em.merge(customer);
        } else {
            em.persist(customer);
        }
    }

    @Override
    public void remove(Long id) {
        Customer customer = findById(id);
        if (customer != null) {
            em.remove(customer);
        }
    }
}
