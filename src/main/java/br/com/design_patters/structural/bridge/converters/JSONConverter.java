package main.java.br.com.design_patters.structural.bridge.converters;

import main.java.br.com.design_patters.structural.bridge.employees.Employee;

public class JSONConverter implements Converter {

  @Override
  public String getEmployeeFormatted(Employee employee) {
    StringBuilder builder = new StringBuilder();

    return builder
      .append("{\n")
      .append("\t\"name\": \"")
      .append(employee.getName())
      .append("\",\n")
      .append("\t\"age\": ")
      .append(employee.getAge())
      .append(",\n")
      .append("\t\"salary\": ")
      .append(employee.getSalary())
      .append("\n}")
      .toString();
  }
}
