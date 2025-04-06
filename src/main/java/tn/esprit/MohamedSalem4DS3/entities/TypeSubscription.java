package tn.esprit.MohamedSalem4DS3.entities;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public enum TypeSubscription {
    @Enumerated(EnumType.STRING)
    ANNUAL,MONTHLY,SEMESTRIAL;
}
