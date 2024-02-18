package ru.clevertec.news.dto.auth;

import ru.clevertec.news.dto.constant.RoleName;

public record SignUpDto(
        String login,
        String password,
        RoleName role) {
}
