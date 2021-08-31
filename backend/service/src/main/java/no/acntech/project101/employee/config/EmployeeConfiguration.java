package no.acntech.project101.employee.config;

//Add componentScan of employee package so that Spring can create beans

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@Configuration
@ComponentScan(basePackages = "no.acntech.project101.employee")
public class EmployeeConfiguration {

}
