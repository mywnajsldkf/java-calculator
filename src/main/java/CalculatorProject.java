import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CalculatorProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput;

        List<Integer> numbers = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        System.out.println("사용자 값 입력");

        userInput = scanner.nextLine();
        System.out.println("입력 값: "+ userInput);

        String[] equation = userInput.split(" ");
        System.out.println("문자식 리스트: "+ equation[0]);
        System.out.println("문자식 리스트: "+ equation[1]);

        for (int i = 0; i < equation.length; i++){
            System.out.println(equation[i]);
            if (equation[i].equals("+") || equation[i].equals("-") || equation[i].equals("*") || equation[i].equals("/")){
                System.out.println("연산자: "+equation[i]);
                operators.add(equation[i]);
            }
            else{
                numbers.add(parseInt(equation[i]));
            }
        }

        System.out.println("숫자: "+numbers);
        System.out.println("연산자: "+operators);
    }

    /*
    void UserInput(){
        Scanner scanner = new Scanner(System.in);
        String userInput;

        userInput = scanner.nextLine();
        System.out.println("입력 값: "+ userInput);
    }
     */
}

