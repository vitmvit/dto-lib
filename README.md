# dto-lib

Данная библиотека содержит необходимые dto-сущности
для [этого проекта](https://github.com/vitmvit/core-service/tree/dev)

Для использования данной библиотеки необходимо запустить таску build, она автоматически выгрузит проект в локальный
maven репозиторий.

## Состав

для пагинации:

- PageContentDto
- PageDto
- PageParamDto
- PageUtils

news-service:

- NewsDto
- NewsUpdateDto
- NewsCreateDto

comments-service:

- CommentDto
- CommentUpdateDto
- CommentCreateDto

auth-service:

- JwtDto
- SignInDto
- SignUpDto
- RoleName