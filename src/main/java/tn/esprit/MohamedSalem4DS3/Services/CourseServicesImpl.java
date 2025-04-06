package tn.esprit.MohamedSalem4DS3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.MohamedSalem4DS3.entities.Course;
import tn.esprit.MohamedSalem4DS3.entities.Support;
import tn.esprit.MohamedSalem4DS3.entities.TypeCourse;
import tn.esprit.MohamedSalem4DS3.repositories.ICourseRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class CourseServicesImpl implements ICourseServices {

    ICourseRepository courseRepository;

    @Override
    public Course retrieveCourse(Long numCourse) { // Renamed and changed to Long
        return courseRepository.findById(numCourse).orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long numCourse) { // Changed to Long
        courseRepository.deleteById(numCourse);
    }

    @Override
    public List<Course> retrieveAllCourses() { // Renamed
        return courseRepository.findAll();
    }

    @Override
    public List<Course> getCoursesByInstructorAndSupport(Long numInstructor, Support support) {
        return courseRepository.findByInstructorNumInstructorAndSupport(numInstructor, support);
    }

    @Override
    public List<Course> getCoursesByType(TypeCourse typeCourse, int numWeek) {
        return courseRepository.findByTypeCourseAndRegistrationsNumWeek(typeCourse, numWeek);
    }
}