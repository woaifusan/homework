import java.util.*;

interface Calculate {
    double calculate(double x, char opearte, double y);
}

class Calculator implements Calculate {

    public double calculate(double x, char operate, double y) {
        if (operate == '+')
            return (x + y);
        if (operate == '-')
            return (x - y);
        if (operate == '*')
            return (x * y);
        if (operate == '/')
            return (x / y);
        else return 0;
    }
}

public class homework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("数字运算符数字");
        String temp = in.nextLine();
        Calculator calculator = new Calculator();
        String c[] = null;
        double z=0.0;
        int position1 = temp.indexOf("+");
        int position2 = temp.indexOf("-");
        int position3 = temp.indexOf("*");
        int position4 = temp.indexOf("/");
        if (position1 !=-1 ) {
            c = temp.split("\\+");
            double x = Double.parseDouble(c[0]);
            double y = Double.parseDouble(c[1]);
            z=calculator.calculate(x, '+', y);
        }
        if (position2 != -1) {
            c = temp.split("\\-");
            double x = Double.parseDouble(c[0]);
            double y = Double.parseDouble(c[1]);
            z=calculator.calculate(x, '-', y);
        }
        if (position3 != -1) {
            c = temp.split("\\*");
            double x = Double.parseDouble(c[0]);
            double y = Double.parseDouble(c[1]);
            z=calculator.calculate(x, '*', y);
        }
        if (position4 != -1) {
            c = temp.split("\\/");
            double x = Double.parseDouble(c[0]);
            double y = Double.parseDouble(c[1]);
            z=calculator.calculate(x, '/', y);
        }
        System.out.println(z);
    }
}
