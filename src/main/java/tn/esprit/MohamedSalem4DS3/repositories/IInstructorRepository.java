package tn.esprit.MohamedSalem4DS3.repositories;

import org.hibernate.query.criteria.JpaDerivedRoot;
import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.MohamedSalem4DS3.entities.Instructor;

public interface IInstructorRepository extends JpaRepository<Instructor, Long> {
}
