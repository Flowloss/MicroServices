package jacob.wigellspadel.repository;

import jacob.wigellspadel.model.Booking;
import jacob.wigellspadel.model.Court;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.util.List;

@Repository
public interface CourtRepository extends JpaRepository<Court, Integer> {
    @Query("SELECT c FROM Court c LEFT JOIN c.booking b WHERE b IS NULL")
    List<Court> findAvailableCourts();
}

