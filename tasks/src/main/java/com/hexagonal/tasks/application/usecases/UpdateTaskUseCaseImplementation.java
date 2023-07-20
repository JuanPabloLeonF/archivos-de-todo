package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.model.Task;
import com.hexagonal.tasks.domain.ports.input.UpdateTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

import java.util.Optional;

public class UpdateTaskUseCaseImplementation implements UpdateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCaseImplementation(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        return taskRepositoryPort.update(updateTask);
    }
}
