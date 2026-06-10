package OtherProjects.hust.soict.globalict.lab01.LAB01;
import javax.swing.JOptionPane;
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, 
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, 
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        String resultMessage = "Results for " + num1 + " and " + num2 + ":\n";
        resultMessage += "- Sum: " + sum + "\n";
        resultMessage += "- Difference: " + difference + "\n";
        resultMessage += "- Product: " + product + "\n";
        if (num2 == 0) {
            resultMessage += "- Quotient: Cannot divide by zero!";
        } else {
            double quotient = num1 / num2;
            resultMessage += "- Quotient: " + quotient;
        }
        JOptionPane.showMessageDialog(null, resultMessage,
                "Calculation Results", JOptionPane.INFORMATION_MESSAGE);
        
        System.exit(0);
    }
}
