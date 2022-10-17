package com.ibik.academic.academicservices.programstudy;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class ProgramStudyServices {

    @Autowired
    private ProgramStudyRepo programstudyRepo;

    public ProgramStudy save(ProgramStudy programstudy) {
        return programstudyRepo.save(programstudy);
    }

    public ProgramStudy update(ProgramStudy programStudy) {
        ProgramStudy result = findOne(programStudy.getId());

        result.setName(programStudy.getName());
        result.setDescription(programStudy.getDescription());
        result.setCode(programStudy.getCode());
        result.setProgram_id(programStudy.getProgram_id());
        result.setFaculty_id(programStudy.getFaculty_id());
        result.setDepartement_id(programStudy.getDepartement_id());
        result.setIs_active(programStudy.isIs_active());

        return result;
    }

    public ProgramStudy findOne(int id) {
        return programstudyRepo.findById(id).get();
    }

    public Iterable<ProgramStudy> findAll() {
        return programstudyRepo.findAll();
    }

    public void removeOne(int id) {
        programstudyRepo.deleteById(id);
        ;
    }

}
