import java.util.Scanner;

public class IT24102510Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number: ");
        double Number = scanner.nextDouble();

        String result = (Number<0) ? "The number is: negetive" :
                        (Number<0) ? "The number is: Positive" :
                        "The number is: Zero";
        
    System.out.println(result);
    }
}