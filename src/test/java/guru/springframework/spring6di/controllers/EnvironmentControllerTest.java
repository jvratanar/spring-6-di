package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"qa", "EN"})
@SpringBootTest
class EnvironmentControllerTest {
    @Autowired
    private EnvironmentController dataSourceController;

    @Test
    void getEnvironment() {
        System.out.println(this.dataSourceController.getEnvironment());
    }
}