package za.co.training.mainapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.co.training.mainapp.service.LearnerService;

@RestController
@RequestMapping("/swaggertest")
public class SwaggerH2Controller {

    @Autowired
    private LearnerService learnerService;

    public SwaggerH2Controller(LearnerService learnerService) {
        this.learnerService = learnerService;
    }

    @GetMapping(value = "/api/getEmployees")
    public Iterable<LearnerService> getAllLearners() {
        return learnerService.getAllLearners();
    }

}
