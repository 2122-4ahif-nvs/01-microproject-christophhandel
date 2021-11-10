package at.htl.library.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Probevorgang {

    //region Fields
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDateTime datum;
    private boolean anmeldungFuerProbe;
    //endregion

    //region Constructor
    public Probevorgang() {
    }

    public Probevorgang(Long id, LocalDateTime datum, boolean anmeldungFuerProbe) {
        this.id = id;
        this.datum = datum;
        this.anmeldungFuerProbe = anmeldungFuerProbe;
    }
    //endregion

    //region Getter and Setter
    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }

    public boolean isAnmeldungFuerProbe() {
        return anmeldungFuerProbe;
    }

    public void setAnmeldungFuerProbe(boolean anmeldungFuerProbe) {
        this.anmeldungFuerProbe = anmeldungFuerProbe;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //endregion
}
