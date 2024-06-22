package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.main.model.Student101;

@Repository
public interface StudentRepository extends CrudRepository<Student101, Integer> {

}
