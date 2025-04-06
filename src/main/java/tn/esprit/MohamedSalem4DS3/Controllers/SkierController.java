package tn.esprit.MohamedSalem4DS3.Controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.MohamedSalem4DS3.Services.ISkierServices;
import tn.esprit.MohamedSalem4DS3.entities.Skier;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("skier")

public class SkierController {


    private ISkierServices skierService;

    @GetMapping("all")
    public List<Skier> retrieveAll(){
        return skierService.getSkiers();
    }


    @PostMapping("add")
    Skier addSkier(@RequestBody Skier skier) {
        return skierService.addSkier(skier);
    }

    @PutMapping("update")
    Skier updateSkier(@RequestBody Skier skier) {
        return skierService.updateSkier(skier);
    }

    @GetMapping("get/{numSkier}")
    Skier retrieveSkier(@PathVariable("numSkier") Long numSkier) {
        return skierService.getSkier(numSkier);
    }

    @DeleteMapping("remove/{numSkier}")
    void removeSkier(@PathVariable("numSkier") Long numSkier) {
        skierService.removeSkier(numSkier);
    }
}


