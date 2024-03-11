package com.shiblee.Employeeservice.service;

import com.shiblee.Employeeservice.Dto.EmployeeDto;
import com.shiblee.Employeeservice.Entity.Employee;
import com.shiblee.Employeeservice.Mapper.EmployeeMapper;
import com.shiblee.Employeeservice.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {

        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        Employee saveDEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployeeDto = EmployeeMapper.mapToEmployeeDto(saveDEmployee);

        return savedEmployeeDto;
    }
}
