package ru.clevertec.news.dto.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.clevertec.news.dto.create.CommentCreateDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CommentUpdateDto extends CommentCreateDto {

    private Long id;
}
