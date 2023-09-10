package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"PROD", "EN"})
@SpringBootTest
class EnvironmentControllerTest {
    @Autowired
    private EnvironmentController dataSourceController;

    @Test
    void getDataSource() {
        System.out.println(this.dataSourceController.getDataSource());
    }
}