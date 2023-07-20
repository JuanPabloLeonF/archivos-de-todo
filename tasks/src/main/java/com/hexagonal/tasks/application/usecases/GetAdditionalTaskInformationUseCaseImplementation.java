package com.hexagonal.tasks.application.usecases;

import com.hexagonal.tasks.domain.model.AdditionalTaskInformation;
import com.hexagonal.tasks.domain.ports.input.GetAdditionalTaskInformationUseCase;
import com.hexagonal.tasks.domain.ports.output.ExternalServicePort;

public class GetAdditionalTaskInformationUseCaseImplementation implements GetAdditionalTaskInformationUseCase {
    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInformationUseCaseImplementation(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInformation getAdditionalTaskInformation(Long id) {
        return externalServicePort.getAdditionalTaskInformation(id);
    }
}
