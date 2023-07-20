package com.hexagonal.tasks.infrastructure.config;

import com.hexagonal.tasks.application.services.TaskService;
import com.hexagonal.tasks.application.usecases.*;
import com.hexagonal.tasks.domain.ports.input.DeleteTaskUseCase;
import com.hexagonal.tasks.domain.ports.input.GetAdditionalTaskInformationUseCase;
import com.hexagonal.tasks.domain.ports.output.ExternalServicePort;
import com.hexagonal.tasks.domain.ports.output.TaskRepositoryPort;
import com.hexagonal.tasks.infrastructure.adapters.ExternalServiceAdapter;
import com.hexagonal.tasks.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInformationUseCase getAdditionalTaskInformationUseCase){
        return new TaskService(
                new CreateTaskUseCaseImplementation(taskRepositoryPort),
                new RetrieveTaskUseCaseImplementation(taskRepositoryPort),
                new UpdateTaskUseCaseImplementation(taskRepositoryPort),
                new DeleteTaskUseCaseImplementation(taskRepositoryPort),
                getAdditionalTaskInformationUseCase
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort(JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInformationUseCase getAdditionalTaskInformationUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInformationUseCaseImplementation(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
