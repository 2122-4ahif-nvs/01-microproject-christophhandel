package at.htl.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Auftritt {

    //region Fields
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String ort;
    private int anzahlAnPlattler;
    private int verdienst;
    private String plattler;
    //endregion

    //region Constructor
    public Auftritt() {
    }

    public Auftritt(Long id, String ort, int anzahlAnPlattler, int verdienst, String plattler) {
        this.id = id;
        this.ort = ort;
        this.anzahlAnPlattler = anzahlAnPlattler;
        this.verdienst = verdienst;
        this.plattler = plattler;
    }
    //endregion

    //region Getter and Setter
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

    public int getVerdienst() {
        return verdienst;
    }

    public void setVerdienst(int verdienst) {
        this.verdienst = verdienst;
    }

    public String getPlattler() {
        return plattler;
    }

    public void setPlattler(String plattler) {
        this.plattler = plattler;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //endregion
}
