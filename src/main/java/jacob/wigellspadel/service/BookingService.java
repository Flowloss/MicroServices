package jacob.wigellspadel.service;

import jacob.wigellspadel.exceptions.ResourceNotFoundException;
import jacob.wigellspadel.model.Booking;
import jacob.wigellspadel.model.Court;
import jacob.wigellspadel.model.User;
import jacob.wigellspadel.repository.BookingRepository;
import jacob.wigellspadel.repository.CourtRepository;
import jacob.wigellspadel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService implements BookingServiceInterface {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CourtRepository courtRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(int id) {
        return bookingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: " + id));
    }

    @Override
    public Booking createBooking(Booking booking) {
        // Fetch the Court and User entities before saving the booking
        User user = userRepository.findById(booking.getUser().getId())
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + booking.getUser().getId()));
        Court court = courtRepository.findById(booking.getCourt().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Court not found with id: " + booking.getCourt().getId()));

        booking.setUser(user);
        booking.setCourt(court);

        return bookingRepository.save(booking);
    }


    @Override
    public Booking updateBooking(int id, Booking updatedBooking) {
        Booking existingBooking = bookingRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: " + id));

        if (updatedBooking.getDatum() != null) {
            existingBooking.setDatum(updatedBooking.getDatum());
        }
        if (updatedBooking.getTid() != null) {
            existingBooking.setTid(updatedBooking.getTid());
        }
        if (updatedBooking.getAntalSpelare() != 0) {
            existingBooking.setAntalSpelare(updatedBooking.getAntalSpelare());
        }
        if (updatedBooking.getTotalpris() != 0) {
            existingBooking.setTotalpris(updatedBooking.getTotalpris());
        }

        // Save and return updated booking
        return bookingRepository.save(existingBooking);
    }
    @Override
    public void deleteBooking(int id) {
        Booking existingBooking = bookingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Booking not found with id: " + id));
        bookingRepository.delete(existingBooking);
    }

    @Override
    public List<Booking> getBookingsByUserId(int id) {
        return bookingRepository.findByUserId(id);
    }

    @Override
    public List<Court> listAvailableCourts() {
        return courtRepository.findAvailableCourts();
    }
}
