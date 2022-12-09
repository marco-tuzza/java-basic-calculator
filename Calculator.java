// This class provides methods for performing basic mathematical operations
public class Calculator {

  // This method adds two numbers and returns the result
  public int add(int a, int b) {
    return a + b;
  }

  // This method subtracts two numbers and returns the result
  public int subtract(int a, int b) {
    return a - b;
  }

  // This method multiplies two numbers and returns the result
  public int multiply(int a, int b) {
    return a * b;
  }

  // This method divides two numbers and returns the result
  public int divide(int a, int b) {
    return a / b;
  }

  // This method calculates the modulo of two numbers and returns the result
  public int modulo(int a, int b) {
    return a % b;
  }

  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();

    // Calculate the sum of 5 and 7 and print the result
    int sum = myCalculator.add(5, 7);
    System.out.println(sum);

    // Calculate the difference of 45 and 11 and print the result
    int subtraction = myCalculator.add(45, 11);
    System.out.println(subtraction);

    // Calculate the product of 3 and 9 and print the result
    int product = myCalculator.multiply(3, 9);
    System.out.println(product);

    // Calculate the quotient of 120 and 10 and print the result
    int quotient = myCalculator.divide(120, 10);
    System.out.println(quotient);

    // Calculate the modulo of 15 and 3 and print the result
    int modulo = myCalculator.modulo(15, 3);
    System.out.println(modulo);
  }
}