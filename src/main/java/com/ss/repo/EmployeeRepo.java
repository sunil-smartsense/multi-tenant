package com.ss.repo;

import com.ss.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
    @Override
    List<Employee> findAll();
}