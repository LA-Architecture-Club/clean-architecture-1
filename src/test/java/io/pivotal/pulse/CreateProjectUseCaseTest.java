package io.pivotal.pulse;

import io.pivotal.pulse.domain.CreateProjectUseCase;
import io.pivotal.pulse.domain.ProjectEntity;
import io.pivotal.pulse.domain.ProjectRepository;
import org.junit.Test;

/**
 * Created by pivotal on 9/9/15.
 */

public class CreateProjectUseCaseTest {

    CreateProjectUseCase createProjectUseCase;
    ProjectRepository projectRepository;

    @Test
    public void createFromTest() throws Exception {
        createProjectUseCase = new CreateProjectUseCase(projectRepository);
        ProjectEntity project = createProjectUseCase.createFrom("testName");

    }

}