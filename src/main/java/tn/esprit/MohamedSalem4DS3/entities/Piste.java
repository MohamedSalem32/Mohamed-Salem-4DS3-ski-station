package tn.esprit.MohamedSalem4DS3.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Piste implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numPiste;
    @Column(nullable = false, unique = true, length = 30)
    String namePiste;

    @Enumerated(EnumType.STRING)
    Color color;

    int length;
    int slope;

    @ManyToMany
    Set<Skier> skiers;
}

