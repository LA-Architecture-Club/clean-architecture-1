package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CreateProjectControllerUnitTest {
    private MockMvc mockMvc;

    private CreateProjectUseCase createProjectUseCase;

    @Before
    public void setup() {
        createProjectUseCase = mock(CreateProjectUseCase.class);
        this.mockMvc = MockMvcBuilders.standaloneSetup(new CreateProjectController(createProjectUseCase)).build();
    }

    @Test
    public void test_that_controller_causes_side_effect() throws Exception {
        mockMvc.perform(post("/project/new").param("name", "test_name"))
                .andExpect(status().isCreated())
                .andReturn();
        verify(createProjectUseCase).createFrom("test_name");
    }

}
