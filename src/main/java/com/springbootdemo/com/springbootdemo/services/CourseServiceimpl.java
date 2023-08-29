package com.springbootdemo.com.springbootdemo.services;

import java.util.ArrayList;
import java.util.List;

import com.springbootdemo.com.springbootdemo.entities.Course;

public class CourseServiceimpl implements CourseService {

	List<Course> list;

	public CourseServiceimpl() {

		list = new ArrayList<>();

		list.add(new Course(123, "java Core", "Java is a good programming language"));
	}

	@Override
	public List<Course> getCourses() {

		return list;
	}

}
