package Online_Quiz_App;

import java.util.*;

class Question {
    String questionText;
    String[] options;
    char correctAnswer;

    public Question(String questionText, String[] options, char correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = Character.toUpperCase(correctAnswer);
    }

    public boolean checkAnswer(char userAnswer) {
        return Character.toUpperCase(userAnswer) == correctAnswer;
    }
}

public class OnlineQuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("Which language is platform independent?", 
                                   new String[]{"A. C", "B. C++", "C. Java", "D. Python"}, 'C'));
        questions.add(new Question("Which keyword is used to inherit a class in Java?", 
                                   new String[]{"A. this", "B. super", "C. extends", "D. implements"}, 'C'));
        questions.add(new Question("Which collection class is synchronized?", 
                                   new String[]{"A. ArrayList", "B. HashMap", "C. Vector", "D. HashSet"}, 'C'));

        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQ" + (i + 1) + ". " + q.questionText);

            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = sc.next().charAt(0);

            if (q.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!  \n Correct Answer: " + q.correctAnswer);
            }
        }

        // Final result
        System.out.println("\n--- Quiz Finished ---");
        System.out.println("Your Score: " + score + "/" + questions.size());

        sc.close();
    }
}


