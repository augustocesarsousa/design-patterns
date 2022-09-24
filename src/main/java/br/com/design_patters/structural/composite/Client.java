package main.java.br.com.design_patters.structural.composite;

import java.util.Arrays;

import main.java.br.com.design_patters.structural.composite.models.File;
import main.java.br.com.design_patters.structural.composite.models.FileSystemItem;
import main.java.br.com.design_patters.structural.composite.models.Folder;

public class Client {

  public static void main(String[] args) {
    FileSystemItem file1 = new File("file1.txt");
    FileSystemItem file2 = new File("file2.txt");
    FileSystemItem file3 = new File("file3.txt");
    FileSystemItem file4 = new File("file4.txt");
    FileSystemItem folder1 = new Folder("folder1", Arrays.asList(file1));
    FileSystemItem folder2 = new Folder(
      "folder2",
      Arrays.asList(file2, folder1)
    );
    FileSystemItem folder3 = new Folder(
      "folder3",
      Arrays.asList(folder2, file3, file4)
    );

    folder3.print("");
  }
}
