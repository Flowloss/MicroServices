package jacob.wigellspadel.model;

import jakarta.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "field_id")
    private Field field;

    @Column(name = "bana")
    private int bana;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "tid")
    private Time time;

    @Column(name = "antal_spelare")
    private int antalSpelare;

    @Column(name = "totalpris")
    private long totalpris;

    public Booking() {
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBana() {
        return bana;
    }

    public void setBana(int bana) {
        this.bana = bana;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getAntalSpelare() {
        return antalSpelare;
    }

    public void setAntalSpelare(int antalSpelare) {
        this.antalSpelare = antalSpelare;
    }

    public long getTotalpris() {
        return totalpris;
    }

    public void setTotalpris(long totalpris) {
        this.totalpris = totalpris;
    }

}

