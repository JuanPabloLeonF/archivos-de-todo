package com.hexagonal.tasks.domain.ports.input;

import com.hexagonal.tasks.domain.model.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);
}
