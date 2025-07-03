package com.bothty.restapihw1.repository;

import com.bothty.restapihw1.domain.Course;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@org.springframework.stereotype.Repository
public class CourseRepository implements Repository<Course, String>{

    private final List<Course> courses = new ArrayList<>(List.of(
            new Course("C001", "CS101", "Intro to Programming", 99.99, true),
            new Course("C002", "CS102", "Data Structures", 119.99, true),
            new Course("C003", "CS103", "Algorithms", 129.99, false),
            new Course("C004", "CS104", "Databases", 89.99, true),
            new Course("C005", "CS105", "Web Development", 149.99, true),
            new Course("C006", "CS106", "Mobile App Dev", 159.99, false),
            new Course("C007", "CS107", "Software Engineering", 139.99, true),
            new Course("C008", "CS108", "Cybersecurity Basics", 109.99, true),
            new Course("C009", "CS109", "Machine Learning", 179.99, false),
            new Course("C010", "CS110", "Cloud Computing", 189.99, true)
    ));

    @Override
    public List<Course> findAll() {
        return courses;
    }

    @Override
    public Course save() {
        return null;
    }

    @Override
    public String delete(String status) {
        return "";
    }

    public Course findByCode(String code) {
        return courses.stream().filter(course -> course.getCode().equals(code)).findFirst().orElse(null);
    }

    public List<Course> findCourse(Boolean status) {
        return courses.stream().filter(course -> course.getStatus().equals(status)).toList();
    }

    public List<Course> findCourse(Boolean status, String title) {
        return courses.stream()
                .filter(course -> course.getStatus().equals(status))
                .filter(course -> course.getTitle().toLowerCase().contains(title.toLowerCase()))
                .toList();
    }
}
