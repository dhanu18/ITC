package com.se.image;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Image {
  public static void main(String[] args) {
    Path path1 = Paths.get("C:\\Users\\user\\source1\\Desert.jpg");
    Path path2 = Paths.get("C:\\Users\\user\\source2\\Desert.jpg");
  //  Path path3 = Paths.get("C:\\Users\\user\\source2\\Tulips.jpg");

    testCompareTo(path1, path2);
  //  testCompareTo(path1, path3);

    testSameFile(path1, path2);
   // testSameFile(path1, path3);
  }

  private static void testCompareTo(Path path1, Path path2) {
    if (path1.compareTo(path2) == 0) {
      System.out.println("identical");
    } else {
      System.out.println("NOT identical");
    }
  }
  private static void testSameFile(Path path1, Path path2) {
    try {
      if (Files.isSameFile(path1, path2)) {
        System.out.println("same file");
      } else {
        System.out.println("NOT the same file");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

 