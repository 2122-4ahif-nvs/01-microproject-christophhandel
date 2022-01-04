package at.htl.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@NamedQueries({
        @NamedQuery(
                name = "Probe.findAll",
                query = "select p from Probe p"
        )}
)

@Entity
public class Probe {

    //region Fields
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message="City may not be blank")
    private String ort;
    @Min(message="Plattler has been very lazy", value=1)
    private int anzahlAnPlattler;
    @NotBlank(message="Plattler may not be blank")
    private String plattler;
    //endregion

    //region Constructor
    public Probe(String ort, int anzahlAnPlattler, String plattler) {
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
