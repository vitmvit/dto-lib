package ru.clevertec.news.dto.page;

import java.util.List;

public record PageContentDto<E>(
        PageDto page,
        List<E> content
) {
}