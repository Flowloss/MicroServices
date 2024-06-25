package jacob.wigellspadel.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "courts")
public class Court {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "court_id")
    private int id;

    @Column(name = "court_name")
    private String courtName;

    @OneToOne(mappedBy = "court", cascade = CascadeType.ALL)
    @JsonBackReference
    private Booking booking;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourtName() {
        return courtName;
    }

    public void setCourtName(String courtName) {
        this.courtName = courtName;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}