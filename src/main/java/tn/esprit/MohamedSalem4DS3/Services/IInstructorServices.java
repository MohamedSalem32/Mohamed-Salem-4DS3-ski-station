package tn.esprit.MohamedSalem4DS3.Services;

import tn.esprit.MohamedSalem4DS3.entities.Instructor;

import java.time.LocalDate;
import java.util.List;

public interface IInstructorServices {

    Instructor retrieveInstructor(Long numInstructor); // Renamed
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long numInstructor);
    List<Instructor> retrieveInstructors();

    // Slide 17
    Instructor addInstructorAndAssignToCourse(Instructor instructor, Long numCourse);

    // Add to IInstructorServices
    List<Instructor> getInstructorsByDate(LocalDate dateOfHire);
}