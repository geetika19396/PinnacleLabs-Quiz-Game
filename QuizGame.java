import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        char choice;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        WELCOME TO JAVA QUIZ GAME");
        System.out.println("========================================");

        System.out.println("\nRules:");
        System.out.println("1. Total 10 Questions.");
        System.out.println("2. Each Correct Answer = 1 Mark.");
        System.out.println("3. No Negative Marking.");
        System.out.println("4. Enter option number (1-4).");

        System.out.print("\nPress Enter to Start...");
        sc.nextLine();

        do {  
            
            int score = 0;

        Question q1 = new Question(
        "1. Which language is used for Android Development?",
        new String[]{
                "Python",
                "Java",
                "HTML",
                "C"
        },
        2
); 

Question q2 = new Question(
    "2. Which keyword is used to create an object in Java?",
    new String[]{
        "this",
        "new",
        "class",
        "void"
    },
    2
);

Question q3 = new Question(
    "3. Which method is the entry point of a Java program?",
    new String[]{
        "start()",
        "main()",
        "run()",
        "init()"
    },
    2
);

Question q4 = new Question(
    "4. Which of the following is not a Java keyword?",
    new String[]{
        "class",
        "public",
        "program",
        "static"
    },
    3
);

Question q5 = new Question(
    "5. Which package contains the Scanner class?",
    new String[]{
        "java.io",
        "java.util",
        "java.lang",
        "java.sql"
    },
    2
);

Question q6 = new Question(
    "6. Which keyword is used to inherit a class in Java?",
    new String[]{
        "implements",
        "extends",
        "inherit",
        "super"
    },
    2
);

Question q7 = new Question(
    "7. Which data type is used to store decimal numbers in Java?",
    new String[]{
        "int",
        "char",
        "double",
        "boolean"
    },
    3
);

Question q8 = new Question(
    "8. Which keyword is used to define a constant in Java?",
    new String[]{
        "const",
        "static",
        "final",
        "fixed"
    },
    3
);

Question q9 = new Question(
    "9. Which method is used to print output in Java?",
    new String[]{
        "print()",
        "System.out.println()",
        "echo()",
        "display()"
    },
    2
);

Question q10 = new Question(
    "10. Which operator is used to compare two values in Java?",
    new String[]{
        "=",
        "==",
        "!=",
        ">="
    },
    2
);

Question[] questions = {
    q1,
    q2,
    q3,
    q4,
    q5,
    q6,
    q7,
    q8,
    q9,
    q10
};

for (Question q : questions) {

    System.out.println("\n" + q.question);

    for (int i = 0; i < q.options.length; i++) {
        System.out.println((i + 1) + ". " + q.options[i]);
    }

    int answer;

do {
    System.out.print("\nEnter your answer (1-4): ");
    answer = sc.nextInt();

    if (answer < 1 || answer > 4) {
        System.out.println("Invalid Input! Please enter a number between 1 and 4.");
    }

} while (answer < 1 || answer > 4);

    if (answer == q.correctAnswer) {
        System.out.println("\nCorrect Answer!");
        score++;
    } else {
        System.out.println("\nWrong Answer!");
        System.out.println("Correct Answer: " + q.options[q.correctAnswer - 1]);

    }
}

System.out.println("\n========================================");
System.out.println("            QUIZ RESULT");
System.out.println("========================================");

System.out.println("Your Score : " + score + "/10");

double percentage = (score / 10.0) * 100;
System.out.printf("Percentage : %.2f%%\n", percentage);

if (percentage >= 90) {
    System.out.println("Grade: Excellent");
} else if (percentage >= 75) {
    System.out.println("Grade: Very Good");
} else if (percentage >= 50) {
    System.out.println("Grade: Good");
} else {
    System.out.println("Grade: Needs Improvement");
}

if (score == 10) {
    System.out.println("Outstanding! Perfect Score!");
}
else if (score >= 8) {
    System.out.println("Excellent Performance!");
}
else if (score >= 6) {
    System.out.println("Good Job! Keep Practicing.");
}
else {
    System.out.println("Keep Learning! You Can Do Better.");
}

System.out.print("\nDo you want to play again? (Y/N): ");
choice = sc.next().charAt(0);
sc.nextLine();

} while (choice == 'Y' || choice == 'y');

System.out.println("\n========================================");
System.out.println("Thank You for Playing Java Quiz Game!");
System.out.println("========================================");

sc.close();
    }
}