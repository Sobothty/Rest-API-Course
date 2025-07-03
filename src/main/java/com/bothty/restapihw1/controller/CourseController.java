package com.bothty.restapihw1.controller;

import com.bothty.restapihw1.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/course")
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/search")
    public Map<String, Object> getCourse(@RequestParam Boolean status){
        return Map.of(
                "data", courseService.getCourses(status)
        );
    }

    @GetMapping("/search")
    public Map<String, Object> getCourse(
            @RequestParam Boolean status,
            @RequestParam String title){
        return Map.of(
                "data", courseService.getCourses(status, title)
        );
    }


}
