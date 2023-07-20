package com.hexagonal.tasks.domain.ports.output;

import com.hexagonal.tasks.domain.model.AdditionalTaskInformation;

public interface ExternalServicePort {
    AdditionalTaskInformation getAdditionalTaskInformation(Long taskId);
}
