package at.htl.entity;

import javax.persistence.*;
import java.time.LocalDate;

@NamedQueries({
        @NamedQuery(
                name = "Plattler.findByName",
                query = "select t from  SC_Plattler t where t.name=:PlattlerName"
        ),
        @NamedQuery(
                name = "Plattler.findAll",
                query = "select t from SC_Plattler t"
        )
})

@Entity(name = "SC_Plattler")
public class Plattler {

    //region Fields
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private int alter;
    //endregion

    //region Constructor
    public Plattler() {
    }

    public Plattler(Long id, String name, int alter) {
        this.id = id;
        this.name = name;
        this.alter = alter;
    }
    //endregion

    //region Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    //endregion

    @Override
    public String toString() {
        return "Plattler hat die Nummer "+ id + ", sein Name ist " + name + " und er/sie ist " + alter+".Jahre alt ";
    }
}
