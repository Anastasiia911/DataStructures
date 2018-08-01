package tasks.employeeStreams;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by anastasiia_911 on 8/1/18.
 */
public class MainEmployee {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee empl = new Employee();
        empl.setBirthDate(LocalDate.now());
        empl.setSalary(BigDecimal.valueOf(6000));

        employeeList.add(empl);
        EmployeeService employeeService = new EmployeeService(employeeList);

        System.out.println(employeeService.findEmpLeapYer().entrySet());
        System.out.println(employeeService.findOverratedEmployees().size());


    }
}
