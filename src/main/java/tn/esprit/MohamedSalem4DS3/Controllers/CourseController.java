package tn.esprit.MohamedSalem4DS3.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.MohamedSalem4DS3.Services.ICourseServices;
import tn.esprit.MohamedSalem4DS3.entities.Course;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("course")
public class CourseController {

    private ICourseServices courseService;

    @GetMapping("all")
    public List<Course> retrieveAllCourses() { // Renamed to match the case study
        return courseService.retrieveAllCourses(); // Updated to match the service
    }

    @PostMapping("add")
    Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @PutMapping("update")
    Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @GetMapping("get/{numCourse}")
    Course retrieveCourse(@PathVariable("numCourse") Long numCourse) {
        return courseService.retrieveCourse(numCourse); // Updated to match the service
    }

    @DeleteMapping("remove/{numCourse}")
    void removeCourse(@PathVariable("numCourse") Long numCourse) {
        courseService.deleteCourse(numCourse);
    }
}