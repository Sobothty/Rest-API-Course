package com.bothty.restapihw1.service.impl;

import com.bothty.restapihw1.domain.Course;
import com.bothty.restapihw1.dto.CourseResponseDto;
import com.bothty.restapihw1.repository.CourseRepository;
import com.bothty.restapihw1.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public List<CourseResponseDto> getAllCourse() {
        return courseRepository.findAll().stream()
                .map(course -> new CourseResponseDto(
                        course.getId(),
                        course.getCode(),
                        course.getTitle(),
                        course.getPrice(),
                        course.getStatus()
                )).toList();
    }

    @Override
    public List<CourseResponseDto> getCourses(Boolean status) {
        return courseRepository.findCourse(status).stream()
                .map(course -> new CourseResponseDto(
                        course.getId(),
                        course.getCode(),
                        course.getTitle(),
                        course.getPrice(),
                        course.getStatus()
                )).toList();
    }

    @Override
    public List<CourseResponseDto> getCourses(Boolean status, String title) {
        return courseRepository.findCourse(status, title).stream()
                .map(course -> new CourseResponseDto(
                        course.getId(),
                        course.getCode(),
                        course.getTitle(),
                        course.getPrice(),
                        course.getStatus()
                )).toList();
    }

    @Override
    public CourseResponseDto getCourseByCode(String code) {
        Course course = courseRepository.findByCode(code);
        return new CourseResponseDto(
                course.getId(),
                course.getCode(),
                course.getTitle(),
                course.getPrice(),
                course.getStatus()
        );
    }

    @Override
    public CourseResponseDto getCourseById(String id) {
        Course course = courseRepository.findById(id);
        return new CourseResponseDto(
                course.getId(),
                course.getCode(),
                course.getTitle(),
                course.getPrice(),
                course.getStatus()
        );
    }

}
