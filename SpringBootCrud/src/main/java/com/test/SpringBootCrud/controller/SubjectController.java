package com.test.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.SpringBootCrud.bean.Subject;
import com.test.SpringBootCrud.service.SubjectService;

@RestController
public class SubjectController { 
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subjects")
    public List<Subject> getAllSubjects()
    {
    	return subjectService.getAllSubjects();
    }
	
	@RequestMapping(method = RequestMethod.POST, value="/subjects")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectService.addsubject(subject);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/subjects/{Id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject)
	{
		subjectService.updatesubject(id, subject);
	}
	
	public void DeleteSubject(@PathVariable String Id)
	{
	    subjectService.deleteSubject(id);
}
}
