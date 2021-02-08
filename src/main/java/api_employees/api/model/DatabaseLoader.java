package api_employees.api.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EmployeeRepository repository;

    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Employee("Juan", "Mendez", "Departamento 1", 000-000000-0,800-000-0000 ));

    }
    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }
}
