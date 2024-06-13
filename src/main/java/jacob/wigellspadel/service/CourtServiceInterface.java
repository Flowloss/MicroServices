package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Court;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourtServiceInterface {
    Court createField(Court court);
    void deleteField(int id);
    Court updateField(int id, Court court);
    List<Court> getAllFields();
    Court getFieldById(int id);
}
