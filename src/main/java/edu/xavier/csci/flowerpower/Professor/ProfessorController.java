package edu.xavier.csci.flowerpower.Professor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ProfessorController {
    private static final Logger logger = LoggerFactory.getLogger(ProfessorController.class);

    @Autowired
    ProfessorService professorService;
    ProfessorRepository professorRepository;

    @CrossOrigin(origins = "*")
    @GetMapping("/professors")
    private List<Professor> getAllProfessors() {

        System.out.println("GOt Called");
    return professorService.getAllProfessors();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/professors/{id}")
    private Professor getProfessor(@PathVariable("id") int id) {
        return professorService.getProfessorById(id);
    }

    @CrossOrigin(origins = "*")
    @DeleteMapping("/professors/{id}")
    private void deleteProfessor(@PathVariable("id") int id) {
        professorService.delete(id);
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/professors")
    private long saveProfessor(@RequestBody Professor professor) {
        professorService.saveOrUpdate(professor);
        return professor.getId();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login", consumes = "application/json", produces = "applcation/json")
    private Professor loginUser(@RequestBody Professor prof) {

//        if (prof.getEmail().equals((/*(ProfessorService.getProfessorByEmail(prof.getEmail()).getEmail*/))
//        {
//            if (prof.getPassword().equals((/*(ProfessorService.getProfessorByEmail(prof.getEmail()).getPassword*/))
//            {
//                return prof;
//            }
//            else{
//            Professor eProf = new Professor();
//            return eProf;
//        }
//        }
//        else{
//            Professor eProf = new Professor();
//            return eProf;
//        }
//
        return prof;
        //return (/*(ProfessorService.getProfessorByEmail(prof.getEmail())*/);
    }
}
