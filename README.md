# Java Calculator
This is a small project related to a CodeCademy course for Java. 

It contains a Calculator class that provides methods for performing basic mathematical operations, such as addition, subtraction, multiplication, division, and modulo.
## Usage
To use the Calculator class, you first need to create an instance of it:
```java
Calculator myCalculator = new Calculator();
```
Once you have an instance of the Calculator class, you can use its methods to perform various mathematical operations. For example, you can use the `add `method to add two numbers, the `subtract` method to subtract two numbers, and so on.
```java
int sum = myCalculator.add(5, 7);
int subtraction = myCalculator.add(45, 11);
int product = myCalculator.multiply(3, 9);
int quotient = myCalculator.divide(120, 10);
int modulo = myCalculator.modulo(15, 3);
```
You can then print the results of these operations to the console:
```java
System.out.println(sum);
System.out.println(subtraction);
System.out.println(product);
System.out.println(quotient);
System.out.println(modulo);
```