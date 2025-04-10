package tn.esprit.MohamedSalem4DS3.entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numCourse;
    int level;

    @Enumerated(EnumType.STRING)
    TypeCourse typeCourse;

    @Enumerated(EnumType.STRING)
    Support support;

    float price;
    int timeSlot;

    @OneToMany(mappedBy = "course")
    Set<Registration> registrations;

    @ManyToOne
    Instructor instructor;
}
