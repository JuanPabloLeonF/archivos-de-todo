package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.model.Task;
import com.hexagonal.tasks.domain.ports.input.CreateTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

public class CreateTaskUseCaseImplementation implements CreateTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImplementation(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.saver(task);
    }
}
