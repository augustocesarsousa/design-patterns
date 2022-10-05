package main.java.br.com.design_patters.structural.proxy.services;

public interface BankOperations {
  void deposit(Long account, Long amount);
  void withdraw(Long account, String passwd, Long amount);
  void changePassword(Long account, String oldPassword, String newPassword);
}
