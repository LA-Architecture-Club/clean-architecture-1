package io.pivotal.pulse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String someIntentionRevealingMethodName(Model projectData) {
        createProjectUseCase.createFrom("project");
        return "project/new";
    }
}
