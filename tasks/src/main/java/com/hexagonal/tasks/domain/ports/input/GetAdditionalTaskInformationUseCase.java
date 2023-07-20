package com.hexagonal.tasks.domain.ports.input;

import com.hexagonal.tasks.domain.model.AdditionalTaskInformation;

public interface GetAdditionalTaskInformationUseCase {
    AdditionalTaskInformation getAdditionalTaskInformation(Long id);
}
