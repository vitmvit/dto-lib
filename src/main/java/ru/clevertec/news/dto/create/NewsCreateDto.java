package ru.clevertec.news.dto.create;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO объект для создания новости
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsCreateDto {

    private String title;
    private String text;
    private Long userId;
}
