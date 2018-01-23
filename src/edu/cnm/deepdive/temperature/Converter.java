package edu.cnm.deepdive.temperature;

public class Converter {

  public static double celsiusToFahrenheit(double celsius) {
  return 9 * celsius / 5 + 32;
  }
  
  public static double farenheitToCelsius(double farenheit) {
    double celsius = 5 * (farenheit - 32) / 9;
    return celsius;
  }
}
