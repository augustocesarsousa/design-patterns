package main.java.br.com.design_patters.structural.bridge.converters;

import main.java.br.com.design_patters.structural.bridge.employees.Employee;

public interface Converter {
  String getEmployeeFormatted(Employee employee);
}
