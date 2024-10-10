package org.example.expert.domain.todo.repository;

import org.example.expert.domain.todo.entity.Todo;


public interface TodoQueryRepository {
    // 2-8
    Todo findByIdByDsl(long todoId);

}
