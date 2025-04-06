package tn.esprit.MohamedSalem4DS3.Services;

import lombok.AllArgsConstructor;
import tn.esprit.MohamedSalem4DS3.entities.Color;
import tn.esprit.MohamedSalem4DS3.entities.Piste;
import tn.esprit.MohamedSalem4DS3.entities.Skier;
import tn.esprit.MohamedSalem4DS3.repositories.IPisteRepository;
import org.springframework.stereotype.Service;
import tn.esprit.MohamedSalem4DS3.repositories.ISkierRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PisteServicesImpl implements IPisteServices {

    private IPisteRepository pisteRepository;
    private ISkierRepository skierRepository;

    @Override
    public Piste addPiste(Piste piste) {

        return pisteRepository.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste retrievePiste(Long numPiste) { // Renamed from getPisteById to match the interface
        return pisteRepository.findById(numPiste).orElse(null);
    }

    @Override
    public void removePiste(Long numPiste) {
        pisteRepository.deleteById(numPiste);
    }

    @Override
    public List<Piste> retrieveAllPistes() { // Renamed from getAllPistes to match the interface
        return pisteRepository.findAll();
    }

    @Override
    public List<Piste> retrieveAllByColor(Color color) {
        return pisteRepository.findByColor(color);
    }

    @Override
    public Piste assignPisteToSkier(Long numPiste, Long numSkier) {
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Skier skier = skierRepository.findById(numSkier).orElse(null);

        assert piste != null;
        piste.getSkiers().add(skier);

        return pisteRepository.save(piste);
    }
}