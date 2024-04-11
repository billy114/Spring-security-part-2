package com.ynov.SecurityPart2.repositories;

import com.ynov.SecurityPart2.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {
}
