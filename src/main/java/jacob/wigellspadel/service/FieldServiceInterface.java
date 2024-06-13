package jacob.wigellspadel.service;

import jacob.wigellspadel.model.Field;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FieldServiceInterface {
    Field createField(Field field);
    void deleteField(int id);
    Field updateField(int id, Field field);
    List<Field> getAllFields();
    Field getFieldById(int id);
}
