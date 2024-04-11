package com.ynov.SecurityPart2.servicesImplem;

import com.ynov.SecurityPart2.models.Course;
import com.ynov.SecurityPart2.repositories.CourseRepo;
import com.ynov.SecurityPart2.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseImplem implements CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public Course createCourse(Course course){
        return courseRepo.save(course);
    }
}
