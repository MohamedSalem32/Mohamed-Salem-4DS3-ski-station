package tn.esprit.MohamedSalem4DS3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.MohamedSalem4DS3.entities.Course;
import tn.esprit.MohamedSalem4DS3.entities.Support;
import tn.esprit.MohamedSalem4DS3.entities.TypeCourse;

import java.util.List;

public interface ICourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByInstructorNumInstructorAndSupport(Long numInstructor, Support support);

    @Query("SELECT c FROM Course c JOIN c.registrations r WHERE c.typeCourse = :typeCourse AND r.numWeek = :numWeek")
    List<Course> findByTypeCourseAndRegistrationsNumWeek(@Param("typeCourse") TypeCourse typeCourse, @Param("numWeek") int numWeek);
}