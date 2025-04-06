package tn.esprit.MohamedSalem4DS3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.MohamedSalem4DS3.entities.Course;
import tn.esprit.MohamedSalem4DS3.entities.Registration;
import tn.esprit.MohamedSalem4DS3.entities.Skier;
import tn.esprit.MohamedSalem4DS3.repositories.ICourseRepository;
import tn.esprit.MohamedSalem4DS3.repositories.IRegistrationRepository;
import tn.esprit.MohamedSalem4DS3.repositories.ISkierRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class RegistrationServicesImpl implements IRegistrationServices {

    private IRegistrationRepository registrationRepository;
    private ISkierRepository skierRepository;
    private ICourseRepository courseRepository;

    @Override
    public Registration addRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration updateRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    @Override
    public Registration retrieveRegistration(Long numRegistration) {
        return registrationRepository.findById(numRegistration).orElse(null);
    }

    @Override
    public void deleteRegistration(Long numRegistration) {
        registrationRepository.deleteById(numRegistration);
    }

    @Override
    public List<Registration> retrieveAllRegistrations() {
        return registrationRepository.findAll();
    }

    @Override
    public Registration addRegistrationAndAssignToSkier(Registration registration, Long numSkier) {
        Skier skier = skierRepository.findById(numSkier).orElse(null);
        registration.setSkier(skier);
        return registrationRepository.save(registration);
    }

    @Override
    public Registration assignRegistrationToCourse(Long numRegistration, Long numCourse) {
        Registration registration = registrationRepository.findById(numRegistration).orElse(null);
        Course course = courseRepository.findById(numCourse).orElse(null);
        assert registration != null;
        registration.setCourse(course);
        return registrationRepository.save(registration);
    }
}