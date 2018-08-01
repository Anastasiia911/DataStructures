package tasks.employeeStreams;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by anastasiia_911 on 8/1/18.
 */
@Data
public class Employee {
    private String name;
    private BigDecimal salary;
    private LocalDate birthDate;
}
