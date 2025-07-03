package com.bothty.restapihw1.controller;

import com.bothty.restapihw1.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;


    @GetMapping
    public Map<String, Object> getAllCourse(){
        return Map.of(
                "data", courseService.getAllCourse()
        );
    }

    @GetMapping("/search")
    public Map<String, Object> getCourse(@RequestParam Boolean status) {
        return Map.of(
                "data", courseService.getCourses(status)
        );
    }

    @GetMapping("/search/title")
    public Map<String, Object> getCourse(
            @RequestParam Boolean status,
            @RequestParam String title) {
        return Map.of(
                "data", courseService.getCourses(status, title)
        );
    }

    @GetMapping("/code")
    public Map<String, Object> getCourseByCode(@RequestParam String code) {
        return Map.of(
                "data", courseService.getCourseByCode(code)
        );
    }

    @GetMapping("/{id}")
    public Map<String, Object> getCourseById(@PathVariable String id) {
        return Map.of(
                "data", courseService.getCourseById(id)
        );
    }

}
