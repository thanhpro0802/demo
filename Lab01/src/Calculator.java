import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog("Enter First Number");
        strNum2 = JOptionPane.showInputDialog("Enter Second Number");
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diference = Math.abs(num1 - num2);
        double product = num1 * num2;

        JOptionPane.showMessageDialog(null,"The sum of the two numbers is: " + sum);
        JOptionPane.showMessageDialog(null,"The difference of the two numbers is: "+ diference);
        JOptionPane.showMessageDialog(null,"The product of the two numbers is: "+ product);

        if (num2 != 0) {
            double quotient = num2 / num1;
            JOptionPane.showMessageDialog(null,"The quotient of the two numbers is: " + quotient);
        } else {
            JOptionPane.showMessageDialog(null,"Division by zero is not allowed.");
        }
    }
}
