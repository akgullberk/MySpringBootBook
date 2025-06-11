package com.akgulberk.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name",nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Column(name = "birth_of_date")
    private Date birthOfDate;

    @ManyToMany
    @JoinTable(name = "student_course",
    joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    private List<Course> courses;


}
