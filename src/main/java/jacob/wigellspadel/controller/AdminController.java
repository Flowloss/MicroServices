package jacob.wigellspadel.controller;

import jacob.wigellspadel.model.Court;
import jacob.wigellspadel.model.User;
import jacob.wigellspadel.service.CourtServiceInterface;
import jacob.wigellspadel.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v5")
public class AdminController {

    @Autowired
    private UserServiceInterface userService;

    @Autowired
    private CourtServiceInterface courtService;

    @GetMapping("/customers")
    @PreAuthorize("hasRole('ADMIN')")
    public List<User> listCustomers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addfield")
    @PreAuthorize("hasRole('ADMIN')")
    public Court addField(@RequestBody Court court) {
        return courtService.createCourt(court);
    }

    @DeleteMapping("/deletefield/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteField(@PathVariable int id) {
        courtService.deleteCourt(id);
    }

    @PutMapping("/updateinfo/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public Court updateCourt(@PathVariable int id, @RequestBody Court court) {
        return courtService.updateCourt(id, court);
    }
}

