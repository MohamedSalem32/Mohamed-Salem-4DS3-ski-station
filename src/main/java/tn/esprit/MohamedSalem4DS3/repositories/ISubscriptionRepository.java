package tn.esprit.MohamedSalem4DS3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.MohamedSalem4DS3.entities.Subscription;

public interface ISubscriptionRepository extends JpaRepository<Subscription, Long> {
}
