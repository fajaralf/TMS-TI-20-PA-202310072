package com.ibik.academic.academicservices.students;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class StudentsServices {

    @Autowired
    private StudentsRepo studentsRepo;

    public Students save(Students students) {
        return studentsRepo.save(students);
    }

    public Students findOne(int id) {
        return studentsRepo.findById(id).get();
    }

    public Iterable<Students> findAll() {
        return studentsRepo.findAll();
    }

    public void removeOne(int id) {
        studentsRepo.deleteById(id);
    }

    public Iterable<Students> findByName(String name) {
        return studentsRepo.findStudentByName("%" + name + "%");
    }

}
