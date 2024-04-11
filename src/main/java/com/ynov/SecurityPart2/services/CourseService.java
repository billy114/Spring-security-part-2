package com.ynov.SecurityPart2.services;

import com.ynov.SecurityPart2.models.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();

    Course createCourse(Course course);
}
