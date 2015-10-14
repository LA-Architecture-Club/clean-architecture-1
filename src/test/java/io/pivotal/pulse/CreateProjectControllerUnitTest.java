package io.pivotal.pulse;

import com.github.javafaker.Faker;
import io.pivotal.pulsedomain.CreateProjectUseCase;
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
    private Faker faker;

    private CreateProjectUseCase createProjectUseCase;

    @Before
    public void setup() {
        createProjectUseCase = mock(CreateProjectUseCase.class);
        this.mockMvc = MockMvcBuilders.standaloneSetup(new CreateProjectController(createProjectUseCase)).build();
        faker = new Faker();
    }

    @Test
    public void test_that_controller_causes_side_effect() throws Exception {
        String code = faker.code().isbn10();
        mockMvc.perform(post("/project/new").param("name", "test_name").param("code", code))
                .andExpect(status().isCreated())
                .andReturn();
        verify(createProjectUseCase).createFrom("test_name", code);
    }
}
