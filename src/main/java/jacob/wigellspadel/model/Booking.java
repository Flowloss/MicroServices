package jacob.wigellspadel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    //@JsonBackReference // Correcting the reference here
    private User user;

    @OneToOne
    @JoinColumn(name = "court_id")
    private Court court;

    @Column(name = "datum")
    private Date datum;

    @Column(name = "tid")
    private Time tid;

    @Column(name = "antal_spelare")
    private int antalSpelare;

    @Column(name = "totalpris")
    private long totalpris;
    public Booking() {
    }


    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
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

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Time getTid() {
        return tid;
    }

    public void setTid(Time tid) {
        this.tid = tid;
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

