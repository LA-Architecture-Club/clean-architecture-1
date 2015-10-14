package io.pivotal.pulse;

import org.junit.Before;
import io.pivotal.pulsedomain.CreateProjectUseCase;
import io.pivotal.pulsedomain.ProjectEntity;
import io.pivotal.pulsedomain.ProjectRepository;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by pivotal on 9/9/15.
 */

public class CreateProjectUseCaseTest {

    CreateProjectUseCase createProjectUseCase;
    ProjectRepository projectRepository;

    @Before
    public void setUp() {
        projectRepository = mock(ProjectRepositoryImpl.class);
    }

    @Test
    public void createFromTest() throws Exception {
        createProjectUseCase = new CreateProjectUseCase(projectRepository);
        ProjectEntity project = createProjectUseCase.createFrom("testName", "4444");
        projectRepository.save(project);
        throw new Exception("implement me");
    }

}