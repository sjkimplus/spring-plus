package org.example.expert.domain.todo.dto.response;

import lombok.Getter;
import org.example.expert.domain.manager.entity.Manager;
import org.example.expert.domain.user.dto.response.UserResponse;

import java.util.List;

@Getter
public class TodoSaveResponse {

    private final Long id;
    private final String title;
    private final String contents;
    private final String weather;
    private final UserResponse user;
    private long manager;

    public TodoSaveResponse(Long id, String title, String contents, String weather, UserResponse user, List<Manager> managers) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.weather = weather;
        this.user = user;
        this.manager = managers.get(0).getUser().getId();

    }
}
