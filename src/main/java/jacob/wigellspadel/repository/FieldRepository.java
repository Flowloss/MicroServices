package jacob.wigellspadel.repository;

import jacob.wigellspadel.model.Booking;
import jacob.wigellspadel.model.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FieldRepository extends JpaRepository<Field, Integer> {
}
