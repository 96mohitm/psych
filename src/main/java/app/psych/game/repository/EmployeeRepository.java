package app.psych.game.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.psych.game.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}