package at.htl.library.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Auftrittvorgang {

    //region Fields
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDateTime startdatum;
    private LocalDateTime endDatum;
    private boolean anmeldungFuerAuftritt;
    //endregion

    //region Constructor
    public Auftrittvorgang() {
    }

    public Auftrittvorgang(Long id, LocalDateTime startdatum, LocalDateTime endDatum, boolean anmeldungFuerAuftritt) {
        this.id = id;
        this.startdatum = startdatum;
        this.endDatum = endDatum;
        this.anmeldungFuerAuftritt = anmeldungFuerAuftritt;
    }
    //endregion

    //region Getter and Setter
    public LocalDateTime getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(LocalDateTime startdatum) {
        this.startdatum = startdatum;
    }

    public LocalDateTime getEndDatum() {
        return endDatum;
    }

    public void setEndDatum(LocalDateTime endDatum) {
        this.endDatum = endDatum;
    }

    public boolean isAnmeldungFuerAuftritt() {
        return anmeldungFuerAuftritt;
    }

    public void setAnmeldungFuerAuftritt(boolean anmeldungFuerAuftritt) {
        this.anmeldungFuerAuftritt = anmeldungFuerAuftritt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //endregion
}
