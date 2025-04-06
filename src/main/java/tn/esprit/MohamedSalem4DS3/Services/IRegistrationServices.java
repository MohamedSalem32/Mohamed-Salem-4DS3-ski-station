package tn.esprit.MohamedSalem4DS3.Services;

import tn.esprit.MohamedSalem4DS3.entities.Registration;

import java.util.List;

public interface IRegistrationServices {
    Registration addRegistration(Registration registration); // Basic create
    Registration updateRegistration(Registration registration); // Basic update
    Registration retrieveRegistration(Long numRegistration); // Read
    void deleteRegistration(Long numRegistration); // Delete
    List<Registration> retrieveAllRegistrations(); // Read all

    // Existing methods from slides 14–15
    Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier);
    Registration assignRegistrationToCourse(Long numRegistration, Long numCourse);
}