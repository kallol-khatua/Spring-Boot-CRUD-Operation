package com.kallol.ems.service;

import java.util.List;
import com.kallol.ems.dto.EmployeeDto;


public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployeeById(Long employeeId, EmployeeDto employeeDto);

    void deleteEmployeeById(Long employeeId);
}
