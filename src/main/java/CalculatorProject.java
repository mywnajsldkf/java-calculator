import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CalculatorProject {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("사용자 값 입력");

        userInput = scanner.nextLine();

        List<String> equation = Arrays.asList(userInput.split(" "));

        Integer sum = parseInt(equation.get(0));
        String operator = "operator";

        System.out.println("최초 값: "+sum);

        for (int i = 1; i < equation.size(); i++){
            if (isOperator(equation.get(i))==true){
                operator = equation.get(i);
            }else {
                sum = calculate(sum, operator, parseInt(equation.get(i)));
            }
        }
        System.out.println(sum);
    }

    public static boolean isOperator(String string){
        if(string.equals("+") || string.equals("-") || string.equals("/") || string.equals("*")){
            return true;
        }else {
            return false;
        }
    }

    public static int add(int sum, int num){
        return sum + num;
    }

    public static int subtract(int sum, int num){
        return sum - num;
    }

    public static int multiply(int sum, int num){
        return sum * num;
    }

    public static int divide(int sum, int num){
        if (num == 0){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        else {
            return sum / num;
        }
        return 0;
    }

    public static int calculate(int sum, String operator, int num){
        if (operator.equals("+")){
            return add(sum, num);
        }
        if (operator.equals("-")) {
            return subtract(sum, num);
        }
        if (operator.equals("*")){
            return multiply(sum, num);
        }
        if (operator.equals("/")){
            return divide(sum, num);
        }
        else System.out.println("잘못된 연산자입니다.");
        return 0;
    }
}
