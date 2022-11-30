package com.test.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.SpringBootCrud.bean.Subject;
import com.test.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectRepo;
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return  subjects;
	}
	public void addsubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}
	public void updatesubject(String id, Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}
	
	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
	}

}
