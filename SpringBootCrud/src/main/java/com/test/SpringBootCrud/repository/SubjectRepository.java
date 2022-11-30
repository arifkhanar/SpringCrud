package com.test.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.test.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject,String>  {
    
}
