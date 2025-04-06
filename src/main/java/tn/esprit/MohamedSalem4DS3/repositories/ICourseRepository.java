package tn.esprit.MohamedSalem4DS3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.MohamedSalem4DS3.entities.Course;

public interface ICourseRepository extends JpaRepository<Course, Long> {
}
