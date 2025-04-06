package tn.esprit.MohamedSalem4DS3.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.MohamedSalem4DS3.Services.IRegistrationServices;
import tn.esprit.MohamedSalem4DS3.entities.Registration;
import tn.esprit.MohamedSalem4DS3.entities.Support;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("registration")
public class RegistrationController {

    private IRegistrationServices registrationServices;

    @GetMapping("all")
    public List<Registration> retrieveAllRegistrations() {
        return registrationServices.retrieveAllRegistrations();
    }

    @PostMapping("add")
    public Registration addRegistration(@RequestBody Registration registration) {
        return registrationServices.addRegistration(registration);
    }

    @PutMapping("update")
    public Registration updateRegistration(@RequestBody Registration registration) {
        return registrationServices.updateRegistration(registration);
    }

    @GetMapping("get/{numRegistration}")
    public Registration retrieveRegistration(@PathVariable Long numRegistration) {
        return registrationServices.retrieveRegistration(numRegistration);
    }

    @DeleteMapping("delete/{numRegistration}")
    public void deleteRegistration(@PathVariable Long numRegistration) {
        registrationServices.deleteRegistration(numRegistration);
    }

    @PostMapping("add/{numSkier}")
    public Registration addRegistrationAndAssignToSkier(@RequestBody Registration registration, @PathVariable Long numSkier) {
        return registrationServices.addRegistrationAndAssignToSkier(registration, numSkier);
    }

    @PutMapping("assign/{numRegistration}/{numCourse}")
    public Registration assignRegistrationToCourse(@PathVariable Long numRegistration, @PathVariable Long numCourse) {
        return registrationServices.assignRegistrationToCourse(numRegistration, numCourse);
    }

    @GetMapping("numWeeksByInstructorAndSupport/{numInstructor}/{support}")
    public int getNumWeeksCourseOfInstructorBySupport(@PathVariable Long numInstructor, @PathVariable Support support) {
        return registrationServices.getNumWeeksCourseOfInstructorBySupport(numInstructor, support);
    }
}