package ru.clevertec.news.dto.auth;

public record SignInDto(
        String login,
        String password) {
}
