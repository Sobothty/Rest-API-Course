package com.bothty.restapihw1.service;

import com.bothty.restapihw1.dto.CourseResponseDto;

import java.util.List;

public interface CourseService {
    List<CourseResponseDto> getCourses(Boolean status);
    List<CourseResponseDto> getCourses(Boolean status, String title);
    CourseResponseDto getCourseByCode(String code);
    CourseResponseDto getCourseById(String id);
}
