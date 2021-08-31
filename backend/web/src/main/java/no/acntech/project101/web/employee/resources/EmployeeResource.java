package no.acntech.project101.web.employee.resources;

import java.net.URI;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import no.acntech.project101.employee.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@CrossOrigin(origins = "http://localhost:3000")
//TODO This is a REST controler and should receive request on path employees
@RestController
@RequestMapping("employees")
public class EmployeeResource {

    //TODO The constructor needs to accept the required dependencies and assign them to class variables
    public EmployeeResource() {

    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> findAll() {
        //TODO create a GET endpoint find all employees in the database and return them
        final EmployeeDto ellisiv = new EmployeeDto(1L, "Ellisiv", "Steen", LocalDate.of(1997, 4, 18), 1L);
        final EmployeeDto solfrid = new EmployeeDto(2L, "Solfrid", "Johansen", LocalDate.of(1997, 2, 6), 1L);
        final List<EmployeeDto> employees = Arrays.asList(ellisiv, solfrid);

        return ResponseEntity.ok(employees);
    }
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable final Long id) {
        // TODO create a GET endpoint that fetches a spesific employee based on its ID
        final EmployeeDto employeeById = new EmployeeDto(1234L, "John", "Do", LocalDate.of(1900, 01, 01), 40L);
        if (employeeById.getId().equals(id)) {
            return ResponseEntity.ok(employeeById);
        } else {
            return ResponseEntity.notFound().build();
        }

    }
    @PostMapping
    public ResponseEntity createEmployee(@RequestBody final EmployeeDto employeeDto) {
        //TODO Create a POST endpoint that accepts an employeeDTO and saves it in the database
        final URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(employeeDto.getId())
                .toUri();
        return ResponseEntity.created(uri).build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity deleteEmployee(@PathVariable final Long id) {
        // TODO Create a DELETE endpoint that deletes a specific employee
        final EmployeeDto employeeById = new EmployeeDto(1234L, "John", "Do", LocalDate.of(1900, 01, 01), 40L);
        if (employeeById.getId().equals(id)) {
            return ResponseEntity.accepted().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PatchMapping("{id}")
    public ResponseEntity updateEmployee(@PathVariable final Long id, @RequestBody EmployeeDto employeeDto) {
        //TODO Create a PATCH endpoint that updates an employee with new values
        final EmployeeDto employeeById = new EmployeeDto(1234L, "John", "Do", LocalDate.of(1900, 01, 01), 40L);
        if (employeeById.getId().equals(id)) {
            return ResponseEntity.accepted().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
