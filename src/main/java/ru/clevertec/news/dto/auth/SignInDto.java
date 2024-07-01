package ru.clevertec.news.dto.auth;

/**
 * DTO объект для входа
 */
public record SignInDto(
        String login,
        String password) {
}
