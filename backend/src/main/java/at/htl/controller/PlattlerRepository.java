package at.htl.controller;

import at.htl.entity.Plattler;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class PlattlerRepository {

    @Inject
    EntityManager em;

    @Transactional
    public Plattler save(Plattler plattler){
        return em.merge(plattler);
    }

    public List<Plattler> getAll(){
        return em.createNamedQuery("Plattler.findAll",Plattler.class).getResultList();
    }

    public Plattler getPlattlerByName(String name){
        return em.createNamedQuery("Plattler.findByName",Plattler.class)
                .setParameter("PlattlerName",name)
                .getSingleResult();
    }
}