package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Court;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourtServiceInterface {
    Court createCourt(Court court);
    void deleteCourt(int id);
    Court updateCourt(int id, Court court);
}