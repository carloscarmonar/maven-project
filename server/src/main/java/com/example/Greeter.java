/**
 * This is a paquete.
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * @param someone the name
   * @return gretting string
   */
  public final String greet(final String someone) {
    return String.format("Carlos que nota dos, %s!", someone);
  }
}
