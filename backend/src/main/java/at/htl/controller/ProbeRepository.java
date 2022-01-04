package at.htl.controller;

import at.htl.entity.Probe;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;

@ApplicationScoped
public class ProbeRepository {

    @Inject
    EntityManager em;

    @Transactional
    public Probe save(Probe probe) {
        return em.merge(probe);
    }

    public List<Probe> findAll() {
        return em.createNamedQuery("Probe.findAll",Probe.class).getResultList();
    }

    public static void validateProbe(@Valid Probe probe) {

    }
}
