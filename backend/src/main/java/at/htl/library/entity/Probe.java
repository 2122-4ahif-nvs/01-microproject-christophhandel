package at.htl.library.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Probe {

    //region Fields
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String ort;
    private int anzahlAnPlattler;
    private String plattler;
    //endregion

    //region Constructor
    public Probe(Long id, String ort, int anzahlAnPlattler, String plattler) {
        this.id = id;
        this.ort = ort;
        this.anzahlAnPlattler = anzahlAnPlattler;
        this.plattler = plattler;
    }

    public Probe() {

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
