package OtherProjects.hust.soict.globalict.lab01.LAB01;

import java.util.Scanner;

public class EquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- EQUATION SOLVER ---");
        System.out.println("1. Solve first-degree equation (ax + b = 0)");
        System.out.println("2. Solve system of first-degree equations");
        System.out.println("3. Solve second-degree equation (ax^2 + bx + c = 0)");
        System.out.print("Please choose an option (1-3): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {

            System.out.println("\n--- First-degree equation ---");
            System.out.print("Input a: ");
            double a = scanner.nextDouble();
            System.out.print("Input b: ");
            double b = scanner.nextDouble();
            
            if (a == 0) {
                if (b == 0) {
                    System.out.println("The equation has infinitely many solutions.");
                } else {
                    System.out.println("The equation has no solution.");
                }
            } else {
                double x = -b / a;
                System.out.println("The solution is x = " + x);
            }
            
        } else if (choice == 2) {

            System.out.println("\n--- System of first-degree equations ---");
            System.out.print("Input a11: "); double a11 = scanner.nextDouble();
            System.out.print("Input a12: "); double a12 = scanner.nextDouble();
            System.out.print("Input b1: ");  double b1 = scanner.nextDouble();
            System.out.print("Input a21: "); double a21 = scanner.nextDouble();
            System.out.print("Input a22: "); double a22 = scanner.nextDouble();
            System.out.print("Input b2: ");  double b2 = scanner.nextDouble();
            double D = a11 * a22 - a21 * a12;
            double D1 = b1 * a22 - b2 * a12;
            double D2 = a11 * b2 - a21 * b1;
            
            if (D != 0) {
                double x1 = D1 / D;
                double x2 = D2 / D;
                System.out.println("The system has a unique solution:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else {
                if (D1 == 0 && D2 == 0) {
                    System.out.println("The system has infinitely many solutions.");
                } else {
                    System.out.println("The system has no solution.");
                }
            }
            
        } else if (choice == 3) {
            System.out.println("\n--- Second-degree equation ---");
            System.out.print("Input a: "); double a = scanner.nextDouble();
            System.out.print("Input b: "); double b = scanner.nextDouble();
            System.out.print("Input c: "); double c = scanner.nextDouble();
            
            if (a == 0) {
                if (b == 0) {
                    if (c == 0) {
                        System.out.println("The equation has infinitely many solutions.");
                    } else {
                        System.out.println("The equation has no solution.");
                    }
                } else {
                    double x = -c / b;
                    System.out.println("The equation becomes linear. Solution is x = " + x);
                }
            } else {
                // Tính Delta
                double delta = b * b - 4 * a * c;
                
                if (delta > 0) {
                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("The equation has two distinct real roots:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = " + x2);
                } else if (delta == 0) {
                    double x = -b / (2 * a);
                    System.out.println("The equation has a double root: x = " + x);
                } else {
                    System.out.println("The equation has no real root.");
                }
            }
        } else {
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}