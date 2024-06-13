package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Booking;
import jacob.wigellspadel.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements BookingServiceInterface {
    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getBookingsByUserId(int userId) {
        return bookingRepository.findByUserId(userId);
    }

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking updateBooking(int id, Booking booking) {
        booking.setId(id);
        return bookingRepository.save(booking);
    }

    @Override
    public void deleteBooking(int id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public List<Booking> findByUserId(int userId) {
        return bookingRepository.findByUserId(userId);
    }
}

