package com.bothty.restapihw1.dto;

public record CourseResponseDto(
        String id,
        String code,
        String title,
        Double price,
        Boolean status
) {
}
