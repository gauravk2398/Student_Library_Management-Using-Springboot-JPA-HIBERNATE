package com.example.Student_Library_Management.Service;

import com.example.Student_Library_Management.Enums.CardStatus;
import com.example.Student_Library_Management.Model.Card;
import com.example.Student_Library_Management.Repository.StudentRepository;
import com.example.Student_Library_Management.Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Date;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public String createStudent(Student student){

        //card should be autoGenerated when create Student is called.
        Card card=new Card();
        card.setStudentVariableName(student);// setting Foreign key.
        card.setStatus(CardStatus.ACTIVATED);//card status is set here.

// moving to student
        student.setCard(card);

        studentRepository.save(student);
        //by Cascading effect, card will automatically save itself.

        return "Student and Card added successfully.";
    }
}
