package bhup7.EntityToDTO.Controller;

import bhup7.EntityToDTO.Converter.EmployeeConverter;
import bhup7.EntityToDTO.DTO.EmployeeDTO;
import bhup7.EntityToDTO.Entity.Employee;
import bhup7.EntityToDTO.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;
    @Autowired
    EmployeeConverter converter;

    @GetMapping("/getEmployeeDTO")
    public List<EmployeeDTO> getAllEmployeeDTO() {
        List<Employee> employees = repository.findAll();
        return converter.entityToDto(employees);
    }

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        List<Employee> employees = repository.findAll();
        return employees;
    }

    @GetMapping("/getEmployeeDTO/{id}")
    public EmployeeDTO findById(@PathVariable(value = "id") int id) {
        Employee employee = repository.findById(id).get();
        return converter.entityToDto(employee);
    }

    @PostMapping("/create")
    public EmployeeDTO create(@RequestBody EmployeeDTO employeeDTO) {
        Employee employee = converter.dtoToEntity(employeeDTO);
        employee = repository.save(employee);
        return converter.entityToDto(employee);
    }
}
