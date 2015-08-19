package io.pivotal.pulse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * A Spring MVC Controller
 *
 * see also:
 * http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/htmlsingle/#mvc-controller
 */
@Controller
public class CreateProjectController {
    private SampleService sampleService;

    @Autowired
    public CreateProjectController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @Autowired
    public CreateProjectController() {

    }

    @RequestMapping("/project/new")
    public void someIntentionRevealingMethodName() {

    }
}
