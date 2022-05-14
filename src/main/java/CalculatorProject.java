import java.util.Scanner;

public class CalculatorProject {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String userInput;

        System.out.println("사용자 값 입력");

        userInput = scanner.nextLine();
        System.out.println("입력 값: "+ userInput);
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

