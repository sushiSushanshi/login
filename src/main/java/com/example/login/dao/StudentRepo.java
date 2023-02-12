package com.example.login.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.login.model.Student;

public interface StudentRepo extends CrudRepository<Student, String>{

}
