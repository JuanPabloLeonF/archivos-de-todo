package com.hexagonal.tasks.domain.ports.input;

import com.hexagonal.tasks.domain.model.Task;
import java.util.Optional;

public interface UpdateTaskUseCase {
    Optional<Task> updateTask(Long id,Task updateTask);
}
