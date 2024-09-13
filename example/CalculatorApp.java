package org.example;
import org.example.add.AddClass;
import org.example.subtract.SubtractClass;
import org.example.multiply.MultiplyClass;
import org.example.divide.Main;

public class CalculatorApp {
    public static void main(String[] args) {
        AddClass add = new AddClass();
        SubtractClass subtract = new SubtractClass();
        MultiplyClass multiply = new MultiplyClass();
        Main divide = new Main();

        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add.add(a, b));
        System.out.println("Subtraction: " + subtract.subtract(a, b));
        System.out.println("Multiplication: " + multiply.multiply(a, b));
        System.out.println("Division: " + divide.divide(a, b));
    }
}