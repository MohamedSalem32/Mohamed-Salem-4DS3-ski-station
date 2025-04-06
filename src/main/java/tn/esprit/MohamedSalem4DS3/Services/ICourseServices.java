package tn.esprit.MohamedSalem4DS3.Services;

import tn.esprit.MohamedSalem4DS3.entities.Course;

import java.util.List;

public interface ICourseServices {

    Course retrieveCourse(Long numCourse); // Renamed and changed to Long
    Course addCourse(Course course);
    Course updateCourse(Course course);
    void deleteCourse(Long numCourse); // Changed to Long
    List<Course> retrieveAllCourses(); // Renamed
}