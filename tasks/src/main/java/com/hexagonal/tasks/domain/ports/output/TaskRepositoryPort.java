package com.hexagonal.tasks.domain.ports.output;

import com.hexagonal.tasks.domain.model.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepositoryPort {
    Task saver(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAllTask();
    Optional<Task> update(Task task);
    boolean deleteById(Long id);
}
