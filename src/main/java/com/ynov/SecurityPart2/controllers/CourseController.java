package com.ynov.SecurityPart2.controllers;

import com.ynov.SecurityPart2.models.Course;
import com.ynov.SecurityPart2.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping
    public ResponseEntity<List<Course>> getAllCourse () {
        return new ResponseEntity<>(
                courseService.getAllCourses(),
                HttpStatus.OK
        );
    }

    @PreAuthorize("hasAuthority('PROF')")
    @PostMapping
    public ResponseEntity<?> createCourse (@RequestBody Course course, Authentication authentication){
        return new ResponseEntity<>(
                courseService.createCourse(course),
                HttpStatus.CREATED
        );
    }

}
