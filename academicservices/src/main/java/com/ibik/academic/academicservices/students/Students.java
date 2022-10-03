package com.ibik.academic.academicservices.students;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")

public class Students implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;

    @Column(length = 15)
    private String npm;

    @Column(length = 10)
    private String firstname;

    @Column(length = 10)
    private String middlename;

    @Column(length = 10)
    private String lastname;

    @Column(length = 11)
    private Integer program_id;

    @Column(length = 11)
    private Integer departement_id;

    public Students() {
    }

    public Students(int id, String npm, String firstname, String middlename, String lastname, Integer program_id,
            Integer departement_id) {
        Id = id;
        this.npm = npm;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.program_id = program_id;
        this.departement_id = departement_id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getProgram_id() {
        return program_id;
    }

    public void setProgram_id(Integer program_id) {
        this.program_id = program_id;
    }

    public Integer getDepartement_id() {
        return departement_id;
    }

    public void setDepartement_id(Integer departement_id) {
        this.departement_id = departement_id;
    }

}
