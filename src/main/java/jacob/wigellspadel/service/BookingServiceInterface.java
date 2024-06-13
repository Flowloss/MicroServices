package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Booking;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingServiceInterface {
    List<Booking> getBookingsByUserId(int userId);
    Booking createBooking(Booking booking);
    Booking updateBooking(int id, Booking booking);
    void deleteBooking(int id);
    List<Booking> findByUserId(int userId);
}

