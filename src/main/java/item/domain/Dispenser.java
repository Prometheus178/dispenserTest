package item.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dispenser", schema = "gasItem")
public class Dispenser {
    private int id;
    private String pistol;
    private String engine;
    private String filter;
    private String stopPlug;

    public Dispenser(){}
    public Dispenser(int id, String pistol, String engine, String filter, String stopPlug) {
        this.id = id;
        this.pistol = pistol;
        this.engine = engine;
        this.filter = filter;
        this.stopPlug = stopPlug;
    }
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getPistol() {
        return pistol;
    }

    public void setPistol(String pistol) {
        this.pistol = pistol;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getStopPlug() {
        return stopPlug;
    }

    public void setStopPlug(String stopPlug) {
        this.stopPlug = stopPlug;
    }


}
