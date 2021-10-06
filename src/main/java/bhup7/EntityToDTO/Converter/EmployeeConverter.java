package bhup7.EntityToDTO.Converter;

import bhup7.EntityToDTO.DTO.EmployeeDTO;
import bhup7.EntityToDTO.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class EmployeeConverter {
    public EmployeeDTO entityToDto(Employee employee){
        EmployeeDTO employeeDTO =new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setDesignation(employee.getDesignation());
        employeeDTO.setAge(employee.getAge());
        return employeeDTO;
    }
    public List<EmployeeDTO> entityToDto(List<Employee> employee)
    {
        return employee.stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }
    public Employee dtoToEntity(EmployeeDTO employeeDTO){
        Employee employee=new Employee();
        employee.setId(employeeDTO.getId());
        employee.setName(employeeDTO.getName());
        employee.setDesignation(employeeDTO.getDesignation());
       employee.setAge(employeeDTO.getAge());
        return employee;
    }
    public List<Employee> dtoToEntity(List<EmployeeDTO> employeeDTO){
        return employeeDTO.stream().map(x -> dtoToEntity(x)).collect(Collectors.toList());
    }
}
