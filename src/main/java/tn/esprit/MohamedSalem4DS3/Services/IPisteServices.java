package tn.esprit.MohamedSalem4DS3.Services;

import tn.esprit.MohamedSalem4DS3.entities.Color;
import tn.esprit.MohamedSalem4DS3.entities.Piste;

import java.util.List;

public interface IPisteServices {
    Piste addPiste(Piste piste);
    Piste updatePiste(Piste piste);
    Piste retrievePiste(Long numPiste);
    void removePiste(Long numPiste);
    List<Piste> retrieveAllPistes();

    List<Piste> retrieveAllByColor(Color color);
    Piste assignPisteToSkier(Long numPiste, Long numSkier);

}
