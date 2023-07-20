package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.ports.input.DeleteTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

public class DeleteTaskUseCaseImplementation implements DeleteTaskUseCase {

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCaseImplementation(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        return taskRepositoryPort.deleteById(id);
    }
}
