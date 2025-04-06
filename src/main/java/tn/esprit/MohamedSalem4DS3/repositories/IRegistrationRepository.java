package tn.esprit.MohamedSalem4DS3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.MohamedSalem4DS3.entities.Registration;
import tn.esprit.MohamedSalem4DS3.entities.Support;

public interface IRegistrationRepository extends JpaRepository<Registration, Long> {
    @Query("SELECT COUNT(DISTINCT r.numWeek) FROM Registration r WHERE r.course.instructor.numInstructor = :numInstructor AND r.course.support = :support")
    int countDistinctWeeksByInstructorAndSupport(@Param("numInstructor") Long numInstructor, @Param("support") Support support);
}