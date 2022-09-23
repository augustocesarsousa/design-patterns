package main.java.br.com.design_patters.structural.bridge;

import main.java.br.com.design_patters.structural.bridge.converters.CVSConverter;
import main.java.br.com.design_patters.structural.bridge.converters.JSONConverter;
import main.java.br.com.design_patters.structural.bridge.employees.Manager;
import main.java.br.com.design_patters.structural.bridge.employees.Seller;

public class Client {

  public static void main(String[] args) {
    CVSConverter cvsConverter = new CVSConverter();
    JSONConverter jsonConverter = new JSONConverter();

    Seller seller = new Seller("João", 23, 3000d);
    Manager manager = new Manager("Maria", 32, 5000d);

    System.out.println(cvsConverter.getEmployeeFormatted(seller));
    System.out.println(jsonConverter.getEmployeeFormatted(seller));
    System.out.println(cvsConverter.getEmployeeFormatted(manager));
    System.out.println(jsonConverter.getEmployeeFormatted(manager));
  }
}
