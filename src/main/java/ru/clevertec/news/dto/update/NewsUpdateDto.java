package ru.clevertec.news.dto.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.clevertec.news.dto.create.NewsCreateDto;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsUpdateDto extends NewsCreateDto {

    private Long id;
}
