package com.springbootdemo.com.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.com.springbootdemo.entities.Course;
import com.springbootdemo.com.springbootdemo.services.CourseService;

@RestController
public class myController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/home")
	public String home() {

		return "Checking the api";
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return this.courseService.getCourses();
	}
}
