package tn.esprit.MohamedSalem4DS3.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum Support {
    @Enumerated(EnumType.STRING)
    SKI,SNOWBOARD;
}
