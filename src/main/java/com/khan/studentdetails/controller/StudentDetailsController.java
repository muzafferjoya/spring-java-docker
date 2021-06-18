package com.khan.studentdetails.controller;

import com.khan.studentdetails.model.StudentDetails;
import com.khan.studentdetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String greeting(){
        return "Welcome to student details application. To fetch student details hit the endpoint student/{rollno}";
    }

    @RequestMapping(value = "student/{rollno}", method = RequestMethod.GET)
    public StudentDetails getAllStudents(@PathVariable int rollno){
        return studentService.listOfStudents(rollno);
    }
}
