package tn.esprit.MohamedSalem4DS3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.MohamedSalem4DS3.entities.Course;
import tn.esprit.MohamedSalem4DS3.entities.Instructor;
import tn.esprit.MohamedSalem4DS3.repositories.ICourseRepository;
import tn.esprit.MohamedSalem4DS3.repositories.IInstructorRepository;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Service
public class InstructorServiceImpl implements IInstructorServices { // Renamed to match file name

    private IInstructorRepository instructorrepository;
    private ICourseRepository courseRepository;

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


    @Override
    @Transactional
    public Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse) {
        Course course = courseRepository.findById(numCourse)
                .orElseThrow(() -> new RuntimeException("Course not found with ID: " + numCourse));
        instructor = instructorrepository.save(instructor);
        course.setInstructor(instructor);
        instructor.getCourses().add(course);
        courseRepository.save(course);
        return instructor;
    }

    @Override
    public List<Instructor> getInstructorsByDate(LocalDate dateOfHire) {
        return instructorrepository.findByDateOfHire(dateOfHire);
    }

}