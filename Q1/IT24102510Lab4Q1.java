import java.util.Scanner;

public class IT24102510Lab4Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        double Number = scanner.nextDouble();

        if(Number<0){ 

        System.out.println("The number is: negetive");
}
        else if (Number>0){
        System.out.println("The number is: Positive");
}
       
        else {
        System.out.println("The number is: Zero");
}
       
      }
}
