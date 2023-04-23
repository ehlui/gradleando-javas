package com.gradleando01.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

  public static void main(String[] args) throws IOException {
    String language = args[0];
    sayHello(language);
  }

  public static String sayHello(final String language) throws IOException {
    InputStream resourceStream = Main.class.getClassLoader().getResourceAsStream(language + ".txt");

    assert resourceStream != null;

    BufferedReader bufferedInputStream = new BufferedReader(
        new InputStreamReader(resourceStream, StandardCharsets.UTF_8));

    return bufferedInputStream.readLine();
  }
}
