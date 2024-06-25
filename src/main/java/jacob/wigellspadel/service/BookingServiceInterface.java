package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Booking;
import jacob.wigellspadel.model.Court;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookingServiceInterface {
    List<Booking> getAllBookings();
    Booking getBookingById(int id);
    Booking createBooking(Booking booking);
    Booking updateBooking(int id, Booking booking);
    void deleteBooking(int id);
    List<Booking> getBookingsByUserId(int id);
    List<Court> listAvailableCourts();
}