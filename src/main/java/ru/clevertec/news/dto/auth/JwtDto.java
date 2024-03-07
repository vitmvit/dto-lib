package ru.clevertec.news.dto.auth;

/**
 * DTO объект для хранения токена
 */
public record JwtDto(
        String accessToken) {
}
