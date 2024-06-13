package jacob.wigellspadel.controller;

import jacob.wigellspadel.model.User;
import jacob.wigellspadel.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v5")
public class AdminController {
    @Autowired
    private UserServiceInterface userService;

    @GetMapping("/customers")
    public List<User> listCustomers() {
        return userService.getAllUsers();
    }

    @PostMapping("/addfield")
    public ResponseEntity<String> addField() {
        // Implement logic to add field
        return ResponseEntity.ok("Field added successfully");
    }

    @DeleteMapping("/deletefield/{id}")
    public ResponseEntity<String> deleteField(@PathVariable int id) {
        // Implement logic to delete field by id
        return ResponseEntity.ok("Field deleted successfully");
    }
}




