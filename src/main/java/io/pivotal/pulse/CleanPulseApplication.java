package io.pivotal.pulse;

import io.pivotal.pulse.domain.CreateProjectUseCase;
import io.pivotal.pulse.domain.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CleanPulseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanPulseApplication.class, args);
    }


    @Autowired
    @Bean
    public CreateProjectUseCase createProjectUseCase(ProjectRepository repository) {
        return new CreateProjectUseCase(repository);
    }
}
