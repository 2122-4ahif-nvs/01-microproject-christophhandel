package at.htl.library.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Ausflug {

    //region Fields
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private LocalDateTime startdatum;
    private LocalDateTime enddatum;
    private String ort;
    private int anzahlAnPlattler;
    //endregion

    //region Constructor
    public Ausflug() {
    }

    public Ausflug(Long id, LocalDateTime startdatum, LocalDateTime enddatum, String ort, int anzahlAnPlattler) {
        this.id = id;
        this.startdatum = startdatum;
        this.enddatum = enddatum;
        this.ort = ort;
        this.anzahlAnPlattler = anzahlAnPlattler;
    }
    //endregion

    //region Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public LocalDateTime getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(LocalDateTime startdatum) {
        this.startdatum = startdatum;
    }

    public LocalDateTime getEnddatum() {
        return enddatum;
    }

    public void setEnddatum(LocalDateTime enddatum) {
        this.enddatum = enddatum;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getAnzahlAnPlattler() {
        return anzahlAnPlattler;
    }

    public void setAnzahlAnPlattler(int anzahlAnPlattler) {
        this.anzahlAnPlattler = anzahlAnPlattler;
    }
    //endregion
}
