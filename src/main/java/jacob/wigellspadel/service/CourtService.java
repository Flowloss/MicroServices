package jacob.wigellspadel.service;

import jacob.wigellspadel.exceptions.ResourceNotFoundException;
import jacob.wigellspadel.model.Court;
import jacob.wigellspadel.repository.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourtService implements CourtServiceInterface {

    @Autowired
    private CourtRepository courtRepository;

    @Override
    public Court createCourt(Court court) {
        return courtRepository.save(court);
    }

    @Override
    public void deleteCourt(int id) {
        courtRepository.deleteById(id);
    }

    @Override
    public Court updateCourt(int id, Court court) {
        Court existingCourt = courtRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Court not found with id " + id));
        existingCourt.setCourtName(court.getCourtName());
        return courtRepository.save(existingCourt);
    }
}

