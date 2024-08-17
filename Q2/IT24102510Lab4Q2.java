 import java.util.Scanner;

public class IT24102510Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double exam = scanner.nextDouble();

        if (exam<0 || exam>100) {
        System.out.print("Invalid input for exam marks. Terminating program.");
        System.exit(0);
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double lab = scanner.nextDouble();
        

        if (lab<0 || lab>100) {
        System.out.println("Invalid input for exam marks. Terminating program.");
        System.exit(0);
        }
        
        double pexam;
        double plab;

        System.out.print("Please enter the percentage given for the exam : ");
        pexam = scanner.nextDouble(); 

        System.out.print("Please enter the percentage given for the lab : ");
        plab = scanner.nextDouble();
        

        if (plab + pexam != 100){
        System.out.println("The percentages must add up to 100. Terminating program.");
        System.exit(1);    
        }

        else {
        double Fexam = exam / 100 * pexam;
        double Flab = lab / 100 * plab;
        double finalmark = Fexam + Flab;

        System.out.println("Final Exam Mark is: " + finalmark); 
        }

    }
}

