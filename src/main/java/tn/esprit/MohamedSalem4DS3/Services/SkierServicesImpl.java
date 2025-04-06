package tn.esprit.MohamedSalem4DS3.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.MohamedSalem4DS3.entities.Skier;
import tn.esprit.MohamedSalem4DS3.repositories.ISkierRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class SkierServicesImpl implements ISkierServices {

    ISkierRepository skierRepository;

    @Override
    public Skier getSkier(Long numSkier) {
        return skierRepository.findById(numSkier).orElse(null);
    }

    @Override
    public Skier addSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public Skier updateSkier(Skier skier) {
        return skierRepository.save(skier);
    }

    @Override
    public void removeSkier(Long numSkier) {
        skierRepository.deleteById(numSkier);
    }

    @Override
    public List<Skier> getSkiers() {
        return skierRepository.findAll();
    }

    @Override
    public Skier assignSkierToPiste(Long numSkier, Long numPiste) {
        return null;
    }
}