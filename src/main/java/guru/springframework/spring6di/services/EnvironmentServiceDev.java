package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service
public class DevEnvironmentService implements EnvironmentService {
    @Override
    public String getEnv() {
        return "Development DataSource";
    }
}
