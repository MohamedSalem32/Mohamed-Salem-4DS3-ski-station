package tn.esprit.MohamedSalem4DS3.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.MohamedSalem4DS3.Services.IInstructorServices;
import tn.esprit.MohamedSalem4DS3.entities.Instructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("instructor")
public class InstructorController {

    private IInstructorServices instructorService;

    @GetMapping("all")
    public List<Instructor> retrieveInstructors() { // Renamed
        return instructorService.retrieveInstructors(); // Updated
    }

    @PostMapping("add")
    Instructor addInstructor(@RequestBody Instructor instructor) { // Renamed
        return instructorService.addInstructor(instructor);
    }

    @PutMapping("update")
    Instructor updateInstructor(@RequestBody Instructor instructor) { // Renamed
        return instructorService.updateInstructor(instructor);
    }

    @GetMapping("get/{numInstructor}")
    Instructor retrieveInstructor(@PathVariable("numInstructor") Long numInstructor) { // Renamed and fixed parameter
        return instructorService.retrieveInstructor(numInstructor); // Updated
    }

    @DeleteMapping("remove/{numInstructor}")
    void removeInstructor(@PathVariable("numInstructor") Long numInstructor) { // Renamed
        instructorService.deleteInstructor(numInstructor);
    }

    @PostMapping("addAndAssignToCourse/{numCourse}")
    public Instructor addInstructorAndAssignToCourse(@RequestBody Instructor instructor, @PathVariable Long numCourse) {
        return instructorService.addInstructorAndAssignToCourse(instructor, numCourse);
    }

    @GetMapping("byDateOfHire/{dateOfHire}")
    public List<Instructor> getInstructorsByDate(@PathVariable LocalDate dateOfHire) {
        return instructorService.getInstructorsByDate(dateOfHire);
    }
}