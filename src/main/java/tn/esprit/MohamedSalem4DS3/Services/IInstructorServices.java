package tn.esprit.MohamedSalem4DS3.Services;

import tn.esprit.MohamedSalem4DS3.entities.Instructor;

import java.util.List;

public interface IInstructorServices {

    Instructor retrieveInstructor(Long numInstructor); // Renamed
    Instructor addInstructor(Instructor instructor);
    Instructor updateInstructor(Instructor instructor);
    void deleteInstructor(Long numInstructor);
    List<Instructor> retrieveInstructors(); // Renamed
}