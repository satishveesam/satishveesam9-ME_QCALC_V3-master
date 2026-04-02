# QCalc - Java Calculator & Quadratic Solver

**QCalc** is a lightweight, command-line Java application that performs basic arithmetic operations (+, -, *, /) and solves quadratic equations of the form **ax² + bx + c = 0**. It's designed for quick calculations and educational purposes.

## Features

- ➕ Basic arithmetic: addition, subtraction, multiplication, division
- 📐 Quadratic equation solver (real and complex roots)
- 🔁 Interactive menu-driven interface
- 🧮 Handles decimal inputs and displays results with precision
- ⚡ Lightweight, no external dependencies

## Prerequisites

- Java Development Kit (JDK) **11 or higher**  
  [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

## Installation & Running

1. **Clone the repository**  
   ```bash
   git clone https://github.com/yourusername/qcalc.git
   cd qcalc
Run the program

bash
java QCalc
How to Use
After running, you’ll see the main menu:


=== QCalc Menu ===
1. Basic Calculator
2. Quadratic Equation Solver
3. Exit
Choose an option:
1. Basic Calculator
Enter two numbers and an operator (+, -, *, /)

Example:
Enter first number: 10
Enter operator: /
Enter second number: 4
Result: 2.5

## 2. Quadratic Equation Solver
Enter coefficients a, b, c for ax² + bx + c = 0

The program shows:

Two real roots if discriminant > 0

One real root if discriminant == 0

Complex roots if discriminant < 0

Example:

text
Enter a: 1
Enter b: -5
Enter c: 6
Roots: 3.0 and 2.0
## 3. Exit
Closes the application.

Full Example Session
text
=== QCalc Menu ===
1. Basic Calculator
2. Quadratic Equation Solver
3. Exit
Choose an option: 2

--- Quadratic Solver ---
Equation: ax² + bx + c = 0
Enter a: 2
Enter b: -4
Enter c: 2
Discriminant = 0
Root: 1.0

Choose an option: 1

--- Basic Calculator ---
Enter first number: 15
Enter operator: *
Enter second number: 3
Result: 45.0

Choose an option: 3
Goodbye!
## Project Structure

qcalc/
├── QCalc.java          # Main source code (copy from below)
└── README.md           # This file
Source Code (QCalc.java)
Copy the entire code below and save it as QCalc.java:

java
import java.util.Scanner;

public class QCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\n=== QCalc Menu ===");
            System.out.println("1. Basic Calculator");
            System.out.println("2. Quadratic Equation Solver");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    basicCalculator(scanner);
                    break;
                case 2:
                    quadraticSolver(scanner);
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 3);
        
        scanner.close();
    }
    
    private static void basicCalculator(Scanner scanner) {
        System.out.println("\n--- Basic Calculator ---");
        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();
        
        double result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);
    }
    
    private static void quadraticSolver(Scanner scanner) {
        System.out.println("\n--- Quadratic Solver ---");
        System.out.println("Equation: ax² + bx + c = 0");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        
        if (a == 0) {
            System.out.println("Not a quadratic equation (a = 0).");
            return;
        }
        
        double discriminant = b * b - 4 * a * c;
        
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots: %.2f and %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Root: %.2f\n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Complex roots: %.2f + %.2fi and %.2f - %.2fi\n",
                              realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
### Contributing
## Fork the repository

Create a feature branch (git checkout -b feature/new-feature)

Commit changes (git commit -m 'Add new feature')

Push to branch (git push origin feature/new-feature)

Open a Pull Request

License
This project is licensed under the MIT License – see the LICENSE file for details.
(You can create a LICENSE file with the MIT license text.)

Author
Your Name – @satishveesam
Project Link:https://github.com/satishveesam/satishveesam9-ME_QCALC_V3-master)
