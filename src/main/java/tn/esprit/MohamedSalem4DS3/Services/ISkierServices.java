package tn.esprit.MohamedSalem4DS3.Services;

import tn.esprit.MohamedSalem4DS3.entities.Skier;
import tn.esprit.MohamedSalem4DS3.entities.TypeSubscription;

import java.util.List;

public interface ISkierServices {

    Skier getSkier(Long numSkier);
    Skier addSkier(Skier skier);
    Skier updateSkier(Skier skier);
    void removeSkier(Long numSkier);
    List<Skier> getSkiers();

    // Slide 16
    Skier assignSkierToPiste(Long numSkier, Long numPiste);

    // Add to ISkierServices
    List<Skier> retrieveSkiersBySubscriptionType(TypeSubscription type);
}
