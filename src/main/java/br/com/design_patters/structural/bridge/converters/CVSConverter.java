package main.java.br.com.design_patters.structural.bridge.converters;

import main.java.br.com.design_patters.structural.bridge.employees.Employee;

public class CVSConverter implements Converter {

  @Override
  public String getEmployeeFormatted(Employee employee) {
    return String.format(
      "%s,%d,%.2f",
      employee.getName(),
      employee.getAge(),
      employee.getSalary()
    );
  }
}
