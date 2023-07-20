package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.model.Task;
import com.hexagonal.tasks.domain.ports.input.RetrieveTaskUseCase;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveTaskUseCaseImplementation implements RetrieveTaskUseCase {
    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCaseImplementation(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTask() {
        return taskRepositoryPort.findAllTask();
    }
}
