package at.htl.controller;

import at.htl.entity.Plattler;
import at.htl.entity.Probe;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class InitBean {

    @Inject
    ProbeRepository probeRepository;

    @Inject
    PlattlerRepository plattlerRepository;

    void init(@Observes StartupEvent event) {
        Probe probe1 = new Probe("OBERBAIRING",22,"Oberbairinger original Plattler");
        probeRepository.save(probe1);
        Probe probe2 = new Probe("Altenberger",15,"Altenberger Plattlerinen");
        probeRepository.save(probe2);
        Plattler plattler1 = new Plattler(1L,"christoph",18);
        plattlerRepository.save(plattler1);
    }
}


