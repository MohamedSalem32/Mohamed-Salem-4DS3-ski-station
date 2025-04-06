package tn.esprit.MohamedSalem4DS3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.MohamedSalem4DS3.entities.Instructor;

import java.time.LocalDate;
import java.util.List;

public interface IInstructorRepository extends JpaRepository<Instructor, Long> {
    List<Instructor> findByDateOfHire(LocalDate dateOfHire);
}