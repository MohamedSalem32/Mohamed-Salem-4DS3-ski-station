package tn.esprit.MohamedSalem4DS3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.MohamedSalem4DS3.entities.Skier;
import tn.esprit.MohamedSalem4DS3.entities.TypeSubscription;

import java.util.List;

public interface ISkierRepository extends JpaRepository<Skier, Long> {
    List<Skier> findBySubscriptionTypeSub(TypeSubscription type);
}