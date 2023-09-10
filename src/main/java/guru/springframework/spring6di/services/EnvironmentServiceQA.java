package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class QAEnvironmentService implements EnvironmentService {
    @Override
    public String getEnv() {
        return "Quality Assurance DataSource";
    }
}
