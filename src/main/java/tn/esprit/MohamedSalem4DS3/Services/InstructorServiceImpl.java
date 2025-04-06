package tn.esprit.MohamedSalem4DS3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.MohamedSalem4DS3.entities.Instructor;
import tn.esprit.MohamedSalem4DS3.repositories.IInstructorRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class InstructorServiceImpl implements IInstructorServices { // Renamed to match file name

    private IInstructorRepository instructorrepository;

    @Override
    public Instructor retrieveInstructor(Long numInstructor) { // Renamed
        return instructorrepository.findById(numInstructor).orElse(null);
    }

    @Override
    public Instructor addInstructor(Instructor instructor) {
        return instructorrepository.save(instructor);
    }

    @Override
    public Instructor updateInstructor(Instructor instructor) {
        return instructorrepository.save(instructor);
    }

    @Override
    public void deleteInstructor(Long numInstructor) {
        instructorrepository.deleteById(numInstructor);
    }

    @Override
    public List<Instructor> retrieveInstructors() { // Renamed
        return instructorrepository.findAll();
    }
}