package ru.clevertec.news.dto.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * DTO объект для изменения новости
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsUpdateDto {

    private Long id;
    private String title;
    private String text;
    private Long userId;
}
