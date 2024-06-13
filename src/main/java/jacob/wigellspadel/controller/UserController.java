package jacob.wigellspadel.controller;

import jacob.wigellspadel.model.Booking;
import jacob.wigellspadel.service.BookingServiceInterface;
import jacob.wigellspadel.service.UserServiceInterface;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v5")
public class UserController {
    @Autowired
    private BookingServiceInterface bookingService;

    @Autowired
    private UserServiceInterface userService;

    @GetMapping("/availability")
    public List<Field> listAvailableTimes() {
        // Implement logic to list available times
        return new ArrayList<>();
    }

    @PostMapping("/booking")
    public Booking bookTime(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping("/mybookings")
    public List<Booking> getMyBookings(@RequestParam int userId) {
        return bookingService.getBookingsByUserId(userId);
    }

    @PutMapping("/bookings/{id}")
    public Booking updateBooking(@PathVariable int id, @RequestBody Booking booking) {
        return bookingService.updateBooking(id, booking);
    }
}

