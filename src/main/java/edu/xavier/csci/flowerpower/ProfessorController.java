package edu.xavier.csci.flowerpower;

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

    @GetMapping("/professors")
    private List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }

    @GetMapping("/professors/{id}")
    private Professor getStudent(@PathVariable("id") int id) {
        return professorService.getProfessorById(id);
    }

    @DeleteMapping("/professors/{id}")
    private void deleteProfessor(@PathVariable("id") int id) {
        professorService.delete(id);
    }

    @PostMapping("/professors")
    private long saveStudent(@RequestBody Professor professor) {
        professorService.saveOrUpdate(professor);
        return professor.getId();
    }
}