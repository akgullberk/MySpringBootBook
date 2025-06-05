package com.akgulberk.controller.impl;

import com.akgulberk.controller.IStudentController;
import com.akgulberk.entities.Student;
import com.akgulberk.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/list")
    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
