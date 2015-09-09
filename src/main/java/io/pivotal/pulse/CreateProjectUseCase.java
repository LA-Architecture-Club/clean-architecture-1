package io.pivotal.pulse;

import org.springframework.stereotype.Component;

@Component
public class CreateProjectUseCase {
    public CreateProjectUseCase(ProjectRepository projectRepository) {
    }

    public ProjectEntity createFrom(String name) {
        return null;
    }
}