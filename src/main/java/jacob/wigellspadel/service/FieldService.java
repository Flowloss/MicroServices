package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Field;
import jacob.wigellspadel.repository.FieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldService implements FieldServiceInterface {

    @Autowired
    private FieldRepository fieldRepository;

    @Override
    public Field createField(Field field) {
        return fieldRepository.save(field);
    }

    @Override
    public void deleteField(int id) {
        fieldRepository.deleteById(id);
    }

    @Override
    public Field updateField(int id, Field field) {
        if (fieldRepository.existsById(id)) {
            field.setId(id);
            return fieldRepository.save(field);
        } else {
            throw new RuntimeException("Field not found with id: " + id);
        }
    }

    @Override
    public List<Field> getAllFields() {
        return fieldRepository.findAll();
    }

    @Override
    public Field getFieldById(int id) {
        return fieldRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Field not found with id: " + id));
    }
}
