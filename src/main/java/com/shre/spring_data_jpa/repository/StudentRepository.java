package com.shre.spring_data_jpa;

import com.shre.spring_data_jpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.name=?1")//JPQL
    List<Student> findByName(String name);
}
