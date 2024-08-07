package ru.clevertec.news.dto.constant;

import lombok.Getter;

/**
 * Enum ролей пользователей
 */

@Getter
public enum RoleName {
    ADMIN("ADMIN"),
    JOURNALIST("JOURNALIST"),
    SUBSCRIBER("SUBSCRIBER"),
    USER("USER");

    private final String role;

    RoleName(String role) {
        this.role = role;
    }
}
