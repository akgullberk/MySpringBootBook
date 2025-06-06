package com.akgulberk.controller;

import com.akgulberk.dto.DtoStudent;
import com.akgulberk.dto.DtoStudentIU;
import com.akgulberk.entities.Student;

import java.util.List;

public interface IStudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public void deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
