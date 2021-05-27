package com.pxp.studentdetails.controller;

import com.pxp.studentdetails.model.StudentDetails;
import com.pxp.studentdetails.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentDetailsController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "student/{rollno}", method = RequestMethod.GET)
    public StudentDetails getAllStudents(@PathVariable int rollno){
        return studentService.listOfStudents(rollno);
    }
}
