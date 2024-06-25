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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @JsonBackReference // Ensure proper JSON serialization
    private User user;

    @OneToOne
    @JoinColumn(name = "court_id")
    @JsonManagedReference // Ensure proper JSON serialization
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


    public double getTotalprisInEUR() {
        double conversionRate = 0.1;
        return this.totalpris * conversionRate;
    }

    // Override toString to display both SEK and EUR
    /*@Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", user=" + user +
                ", court=" + court +
                ", datum=" + datum +
                ", tid=" + tid +
                ", antalSpelare=" + antalSpelare +
                ", totalpris=" + totalpris + " SEK" +
                ", totalprisInEUR=" + getTotalprisInEUR() + " EUR" +
                '}';
    }*/
}