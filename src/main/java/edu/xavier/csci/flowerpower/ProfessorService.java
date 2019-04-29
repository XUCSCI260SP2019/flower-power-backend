package edu.xavier.csci.flowerpower;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProfessorService {

    private ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) { this.professorRepository = professorRepository; }

    public List<Professor> getAllProfessors() {
        List<Professor> professors = new ArrayList<Professor>();
        professorRepository.findAll().forEach(professor -> professors.add(professor));
        return professors;
    }

    public Professor getProfessorById(int id) {
        return professorRepository.findById(id).get();
    }

    public void saveOrUpdate(Professor professor) {
        professorRepository.save(professor);
    }

    public void delete(int id) {
        professorRepository.deleteById(id);
    }
}