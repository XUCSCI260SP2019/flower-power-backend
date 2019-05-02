package edu.xavier.csci.flowerpower.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class StudentController {
    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    private List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    private Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    private void deleteStudent(@PathVariable("id") int id) {
        studentService.delete(id);
    }

    @PostMapping("/students")
    private long saveStudent(@RequestBody Student student) {
        studentService.saveOrUpdate(student);
        return student.getId();
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/login", consumes = "application/json", produces = "application/json")
    private Student loginUser(@RequestBody Student student) {
//        if (student.getEmail().equals((/*(StudentService.getStudentByEmail(student.getEmail()).getEmail*/))
//        {
//            if (student.getPassword().equals((/*(StudentService.getStudentByEmail(student.getEmail()).getPassword*/))
//            {
//                return student;
//            }
//            else{
//            Student stud = new Student();
//            return stud;
//        }
//        }
//        else{
//            Student stud = new Student();
//            return stud;
//        }
        return student;
        //return (/*(StudentService.getStudentByEmail(student.getEmail())*/);
    }
}