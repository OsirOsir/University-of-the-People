import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalQuestions = 5;
        int correctAnswers = 0;


        String[] questions = {
            "1. What is the capital of France?\nA. Berlin\nB. Madrid\nC. Paris\nD. Rome",
            "2. What is 2 + 2?\nA. 3\nB. 4\nC. 5\nD. 6",
            "3. Which planet is known as the Red Planet?\nA. Earth\nB. Mars\nC. Jupiter\nD. Saturn",
            "4. Who wrote 'To Kill a Mockingbird'?\nA. Harper Lee\nB. J.K. Rowling\nC. Ernest Hemingway\nD. Mark Twain",
            "5. What is the chemical symbol for water?\nA. O2\nB. H2O\nC. CO2\nD. NaCl"
        };

        char[] answers = {'C', 'B', 'B', 'A', 'B'};

   
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println(questions[i]); // Display question
            System.out.print("Enter your answer (A, B, C, or D): ");
            char userAnswer = scanner.next().toUpperCase().charAt(0); // Get user input

       
            if (userAnswer == answers[i]) {
                correctAnswers++;
            }
        }

        int score = (correctAnswers * 100) / totalQuestions;


        System.out.println("You answered " + correctAnswers + " out of " + totalQuestions + " questions correctly.");
        System.out.println("Your final score is: " + score + "%");
    }
}
