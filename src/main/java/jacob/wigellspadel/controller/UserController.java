package jacob.wigellspadel.controller;


import jacob.wigellspadel.model.Booking;
import jacob.wigellspadel.model.Court;
import jacob.wigellspadel.service.BookingServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v5")
public class UserController {

    @Autowired
    private BookingServiceInterface bookingService;

    @GetMapping("/availability")
    @PreAuthorize("hasRole('USER')")
    public List<Court> listAvailableTimes() {
        return bookingService.listAvailableCourts();
    }

    @PostMapping("/booking")
    @PreAuthorize("hasRole('USER')")
    public Booking bookTime(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping("/mybookings/{id}")
    @PreAuthorize("hasRole('USER')")
    public List<Booking> getMyBookings(@PathVariable int id) {
        return bookingService.getBookingsByUserId(id);
    }

    @PutMapping("/bookings/{id}")
    @PreAuthorize("hasRole('USER')")
    public Booking updateBooking(@PathVariable int id, @RequestBody Booking booking) {
        return bookingService.updateBooking(id, booking);
    }
}


