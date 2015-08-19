package io.pivotal.pulse;

import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class CreateProjectControllerUnitTest {
    private MockMvc mockMvc;

//    private SampleService mockSampleService;

    @Before
    public void setup() {
//        mockSampleService = mock(SampleService.class);
        this.mockMvc = MockMvcBuilders.standaloneSetup(new CreateProjectController()).build();
    }

    @Test
    public void test_that_controller_causes_side_effect() throws Exception {
        mockMvc.perform(get("/project/new"))
                .andExpect(status().isOk())
                .andReturn();
//        verify(mockSampleService).causeSomeSideEffect();
    }

}
