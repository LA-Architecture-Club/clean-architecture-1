package io.pivotal.pulse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreateProjectUseCase {

    @Autowired
    public CreateProjectUseCase(ProjectRepository projectRepository) {
    }

    public ProjectEntity createFrom(String name) {
        return null;
    }
}