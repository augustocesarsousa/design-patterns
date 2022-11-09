package main.java.br.com.design_patters.behavioral.iterator;

public class Client {

  public static void main(String[] args) {
    TV tv = new TV();
    tv.searchAvaiableChannels();
    for (Integer channel : tv) {
      System.out.println(String.format("Zapping at channel #%d", channel));
    }
  }
}
