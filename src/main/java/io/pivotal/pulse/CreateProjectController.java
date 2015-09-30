package io.pivotal.pulse;

import io.pivotal.pulse.domain.CreateProjectUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * A Spring MVC Controller
 *
 * see also:
 * http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/htmlsingle/#mvc-controller
 */
@Controller
public class CreateProjectController {

    private CreateProjectUseCase createProjectUseCase;

    @Autowired
    public CreateProjectController(CreateProjectUseCase createProjectUseCase) {
        this.createProjectUseCase = createProjectUseCase;
    }

    @RequestMapping("/project/new")
    @ResponseStatus(HttpStatus.CREATED)
    public String someIntentionRevealingMethodName(@RequestParam String name) {
        createProjectUseCase.createFrom(name);
        return "project/new";
    }
}
