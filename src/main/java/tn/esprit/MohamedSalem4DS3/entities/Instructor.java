package tn.esprit.MohamedSalem4DS3.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInstructor;
    String firstName;
    String lastName;
    LocalDate dateOfHire;

    @OneToMany(mappedBy = "instructor")
    Set<Course> courses;

}
