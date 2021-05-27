package com.pxp.studentdetails.service;

import com.pxp.studentdetails.model.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StudentService {

    @Autowired
    private RestTemplate restTemplate;

    public StudentDetails listOfStudents(int rollno){
        List<Student> students = Arrays.asList(
                new Student(1,"Teresa","Buttler"),
                new Student(2, "Carlos", "Bryant"));
        return students
                .stream()
                .filter(s -> s.getRollNo() == rollno)
                .findFirst()
                .map(s -> {
                    StudentDetails studentDetails = new StudentDetails();
                    Map<String, Integer> subjectMarkMap = new HashMap<>();
                    restTemplate.getForEntity("http://subject-details/subject/"+s.getRollNo(), Subjects.class)
                    .getBody().getSubjects().stream().forEach(sub -> {
                        MarksArray marksArray = restTemplate.getForEntity("http://marks-details:8083/marks/"+s.getRollNo(), MarksArray.class).getBody();
                        List<Marks> marks = marksArray.getMarksList();
                        marks.stream().forEach(mark -> {
                            subjectMarkMap.put(mark.getSubject(), mark.getMark());
                        });
                    });
                    studentDetails = new StudentDetails(rollno, s.getFirstName(), s.getLastName(), subjectMarkMap);
                    return studentDetails;
                })
                .get();
    }
}
