package com.example.Student_Library_Management.Model;

import jakarta.persistence.*;
import org.hibernate.annotations.Type;
import org.hibernate.id.IdentityGenerator;
import org.hibernate.id.factory.internal.IdentityGenerationTypeStrategy;
import org.springframework.web.bind.annotation.Mapping;

@Entity
@Table(name="student_info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(unique= true)
    private String email;
    private String Country;
    private String mobNo;
    private int age;
    @OneToOne(mappedBy = "studentVariableName", cascade=CascadeType.ALL)
    private Card card;


    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }


    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
