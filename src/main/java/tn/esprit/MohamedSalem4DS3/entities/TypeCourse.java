package tn.esprit.MohamedSalem4DS3.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum TypeCourse {
    @Enumerated(EnumType.STRING)
    COLLECTIVE_CHILDREN,COLLECTIVE_ADULT,INDIVIDUAL;
}
