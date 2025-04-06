package tn.esprit.MohamedSalem4DS3.Controllers;

import tn.esprit.MohamedSalem4DS3.entities.Color;
import tn.esprit.MohamedSalem4DS3.entities.Piste;
import tn.esprit.MohamedSalem4DS3.Services.IPisteServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("piste")
public class PisteController {

    private IPisteServices pisteServices;

    @GetMapping("all")
    public List<Piste> retrieveAllPistes() {
        return pisteServices.retrieveAllPistes(); // Updated from getAllPistes to match the service
    }

    @PostMapping("add")
    Piste addPiste(@RequestBody Piste piste) {
        return pisteServices.addPiste(piste);
    }

    @PutMapping("update")
    Piste updatePiste(@RequestBody Piste piste) {
        return pisteServices.updatePiste(piste);
    }

    @DeleteMapping("delete/{numPiste}")
    void deletePiste(@PathVariable("numPiste") Long numPiste) {
        pisteServices.removePiste(numPiste);
    }

    @GetMapping("get/{numPiste}")
    Piste retrievePiste(@PathVariable("numPiste") Long numPiste) { // Updated from getPisteById to match the service
        return pisteServices.retrievePiste(numPiste);
    }

    @GetMapping("getByColor/{color}")
    public List<Piste> retrieveAllByColor(@PathVariable("color") Color color) {
        return pisteServices.retrieveAllByColor(color);
    }

    @PutMapping("assignToSkier/{numPiste}/{numSkier}")
    public Piste assignPisteToSkier(@PathVariable Long numPiste, @PathVariable Long numSkier) {
        return pisteServices.assignPisteToSkier(numPiste, numSkier);
    }
}