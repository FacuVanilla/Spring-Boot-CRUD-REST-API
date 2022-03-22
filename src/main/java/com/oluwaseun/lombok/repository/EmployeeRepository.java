package com.oluwaseun.lombok.repository;


import com.oluwaseun.lombok.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
