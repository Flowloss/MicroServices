package jacob.wigellspadel.service;

import jacob.wigellspadel.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserServiceInterface {
        List<User> getAllUsers();
        User getUserById(int id);
        User createUser(User user);
        User updateUser(int id, User user);
        void deleteUser(int id);
}