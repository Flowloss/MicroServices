package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Court;
import jacob.wigellspadel.repository.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourtService implements CourtServiceInterface {

    @Autowired
    private CourtRepository fieldRepository;

    @Override
    public Court createField(Court court) {
        return fieldRepository.save(court);
    }

    @Override
    public void deleteField(int id) {
        fieldRepository.deleteById(id);
    }

    @Override
    public Court updateField(int id, Court court) {
        if (fieldRepository.existsById(id)) {
            court.setId(id);
            return fieldRepository.save(court);
        } else {
            throw new RuntimeException("Field not found with id: " + id);
        }
    }

    @Override
    public List<Court> getAllFields() {
        return fieldRepository.findAll();
    }

    @Override
    public Court getFieldById(int id) {
        return fieldRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Field not found with id: " + id));
    }
}
