package tasks.employeeStreams;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by anastasiia_911 on 8/1/18.
 */
@AllArgsConstructor
public class EmployeeService {
    private List<Employee> employeeList;


    private boolean isLeapYear(LocalDate birthDate) {
        boolean isLeapYear;
        isLeapYear = (birthDate.getYear() % 4) == 0;
        return isLeapYear;
    }

    public Map<Boolean, List<Employee>> findEmpLeapYer() {

        List<Employee> leapYearStream;
        List<Employee> notLeapYearStream;
        Map<Boolean, List<Employee>> empLeapYear = new HashMap<>();

        leapYearStream = employeeList
                .stream()
                .filter(employee -> isLeapYear(employee.getBirthDate()))
                .collect(Collectors.toList());

        notLeapYearStream = employeeList
                .stream()
                .filter(employee -> !isLeapYear(employee.getBirthDate()))
                .collect(Collectors.toList());

        empLeapYear.put(true, leapYearStream);
        empLeapYear.put(false, notLeapYearStream);

        return empLeapYear;
    }

    private int getEmployeeAge(Employee empl) {
        return (LocalDate.now().getYear() - empl.getBirthDate().getYear());
    }

    private boolean isOverrated(Employee empl) {
        boolean isOverrated =
                (empl.getSalary().compareTo(BigDecimal.valueOf(5000)) == 1
                        && (getEmployeeAge(empl)) <= 30);

        return isOverrated;
    }

    public List<Employee> findOverratedEmployees() {
        List<Employee> overratedEmployees = employeeList
                .stream()
                .filter(
                        empl ->
                                isOverrated(empl)).collect(Collectors.toList());

        return overratedEmployees;
    }

}


