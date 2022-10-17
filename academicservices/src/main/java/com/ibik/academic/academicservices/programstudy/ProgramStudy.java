package com.ibik.academic.academicservices.programstudy;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "programstudy")

public class ProgramStudy implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    @NotEmpty(message = "Name is required")
    private String name;

    @Column(length = 255)
    private String description;

    @Column(length = 5)
    @NotEmpty(message = "Code is required")
    private String code;

    @Column(length = 11)
    private Integer program_id;

    @Column(length = 11)
    private Integer faculty_id;

    @Column(length = 11)
    private Integer departement_id;

    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean is_active;

    public ProgramStudy() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProgramStudy(int id, String name, String description, String code, Integer program_id, Integer faculty_id,
            Integer departement_id, boolean is_active) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.code = code;
        this.program_id = program_id;
        this.faculty_id = faculty_id;
        this.departement_id = departement_id;
        this.is_active = is_active;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getProgram_id() {
        return program_id;
    }

    public void setProgram_id(Integer program_id) {
        this.program_id = program_id;
    }

    public Integer getFaculty_id() {
        return faculty_id;
    }

    public void setFaculty_id(Integer faculty_id) {
        this.faculty_id = faculty_id;
    }

    public Integer getDepartement_id() {
        return departement_id;
    }

    public void setDepartement_id(Integer departement_id) {
        this.departement_id = departement_id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

}
