package com.ibik.academic.academicservices.programstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/programstudy")

public class ProgramStudyController {

    @Autowired
    private ProgramStudyServices programstudyServices;

    @PostMapping
    public ProgramStudy posProgramStudy(@RequestBody ProgramStudy programstudy) {
        return programstudyServices.save(programstudy);
    }

    @GetMapping
    public Iterable<ProgramStudy> fetchProgramStudy() {
        return programstudyServices.findAll();
    }

    @GetMapping("/{id}")
    public ProgramStudy fetchProgramStudyById(@PathVariable("id") int id) {
        return programstudyServices.findOne(id);
    }

    @PutMapping
    public ProgramStudy updateProgramStudy(@RequestBody ProgramStudy programstudy) {
        return programstudyServices.save(programstudy);
    }

    @DeleteMapping("/{id}")
    public void deleteProgramStudyById(@PathVariable("id") int id) {
        programstudyServices.removeOne(id);
    }

}
