import java.util.*;

public class App {
    
    public static void main(String[] args) {
        // Create 10 student objects
        // Create students
        Student student1 = new Student(1, "Prashant", "prashant@example.com", "1234567890");
        Student student2 = new Student(2, "Rohan", "rohan@example.com", "9876543210");
        Student student3 = new Student(3, "Mike", "mike@example.com", "4567891230");
        Student student4 = new Student(4, "Emily", "emily@example.com", "7891234560");
        Student student5 = new Student(5, "David", "david@example.com", "3216549870");
        Student student6 = new Student(6, "Sarah", "sarah@example.com", "6549873210");
        Student student7 = new Student(7, "Alex", "alex@example.com", "1237894560");
        Student student8 = new Student(8, "Olivia", "olivia@example.com", "9874563210");
        Student student9 = new Student(9, "Daniel", "daniel@example.com", "4561237890");
        Student student10 = new Student(10, "Sophia", "sophia@example.com", "7893216540");

        // Create trainers
        Trainer trainer1 = new Trainer(1, "Trainer1", "trainer1@example.com", "1234567890", new ArrayList<>());
        Trainer trainer2 = new Trainer(2, "Trainer2", "trainer2@example.com", "9876543210", new ArrayList<>());
        Trainer trainer3 = new Trainer(3, "Trainer3", "trainer3@example.com", "4567891230", new ArrayList<>());

        // Create 4 assignments
        Assignment assignment1 = new Assignment(1, "Assignment 1", "Description 1", new ArrayList<>());
        Assignment assignment2 = new Assignment(2, "Assignment 2", "Description 2", new ArrayList<>());
        Assignment assignment3 = new Assignment(3, "Assignment 3", "Description 3", new ArrayList<>());
        Assignment assignment4 = new Assignment(4, "Assignment 4", "Description 4", new ArrayList<>());

        // Create 5 tech stacks
        TechStack techStack1 = new TechStack(1, "Java", "Object-oriented programming language");
        TechStack techStack2 = new TechStack(2, "Python", "High-level programming language");
        TechStack techStack3 = new TechStack(3, "JavaScript", "Scripting language for web development");
        TechStack techStack4 = new TechStack(4, "C#", "General-purpose programming language");
        TechStack techStack5 = new TechStack(5, "Ruby", "Dynamic, reflective, object-oriented language");

        // Create 16 answers
        String[] options = {"A", "B", "C", "D"};

        Answer answer1 = new Answer(1, new ArrayList<>(Arrays.asList(options)));
        Answer answer2 = new Answer(2, new ArrayList<>(Arrays.asList(options)));
        Answer answer3 = new Answer(3, new ArrayList<>(Arrays.asList(options)));
        Answer answer4 = new Answer(4, new ArrayList<>(Arrays.asList(options)));
        Answer answer5 = new Answer(5, new ArrayList<>(Arrays.asList(options)));
        Answer answer6 = new Answer(6, new ArrayList<>(Arrays.asList(options)));
        Answer answer7 = new Answer(7, new ArrayList<>(Arrays.asList(options)));
        Answer answer8 = new Answer(8, new ArrayList<>(Arrays.asList(options)));
        Answer answer9 = new Answer(9, new ArrayList<>(Arrays.asList(options)));
        Answer answer10 = new Answer(10, new ArrayList<>(Arrays.asList(options)));
        Answer answer11 = new Answer(11, new ArrayList<>(Arrays.asList(options)));
        Answer answer12 = new Answer(12, new ArrayList<>(Arrays.asList(options)));
        Answer answer13 = new Answer(13, new ArrayList<>(Arrays.asList(options)));
        Answer answer14 = new Answer(14, new ArrayList<>(Arrays.asList(options)));
        Answer answer15 = new Answer(15, new ArrayList<>(Arrays.asList(options)));
        Answer answer16 = new Answer(16, new ArrayList<>(Arrays.asList(options)));

        // Create 4 questions for assignment1
        Question question1 = new Question(1, new ArrayList<>(), "A", 10, techStack1.getTechStackId(), assignment1.getAssignmentId());
        Question question2 = new Question(2, new ArrayList<>(), "B", 10, techStack1.getTechStackId(), assignment1.getAssignmentId());
        Question question3 = new Question(3, new ArrayList<>(), "A", 10, techStack1.getTechStackId(), assignment1.getAssignmentId());
        Question question4 = new Question(4, new ArrayList<>(), "D", 10, techStack1.getTechStackId(), assignment1.getAssignmentId());

        // Create 4 questions for assignment2
        Question question5 = new Question(5, new ArrayList<>(), "D", 10, techStack2.getTechStackId(), assignment2.getAssignmentId());
        Question question6 = new Question(6, new ArrayList<>(), "A", 10, techStack2.getTechStackId(), assignment2.getAssignmentId());
        Question question7 = new Question(7, new ArrayList<>(), "C", 10, techStack2.getTechStackId(), assignment2.getAssignmentId());
        Question question8 = new Question(8, new ArrayList<>(), "A", 10, techStack2.getTechStackId(), assignment2.getAssignmentId());

        // Create 4 questions for assignment3
        Question question9 = new Question(9, new ArrayList<>(), "B", 10, techStack3.getTechStackId(), assignment3.getAssignmentId());
        Question question10 = new Question(10, new ArrayList<>(), "D", 10,techStack3.getTechStackId(), assignment3.getAssignmentId());
        Question question11 = new Question(11, new ArrayList<>(), "A", 10, techStack3.getTechStackId(), assignment3.getAssignmentId());
        Question question12 = new Question(12, new ArrayList<>(), "C", 10, techStack3.getTechStackId(), assignment3.getAssignmentId());

        // Create 4 questions for assignment4
        Question question13 = new Question(13, new ArrayList<>(), "A", 10, techStack4.getTechStackId(), assignment4.getAssignmentId());
        Question question14 = new Question(14, new ArrayList<>(), "D", 10, techStack4.getTechStackId(), assignment4.getAssignmentId());
        Question question15 = new Question(15, new ArrayList<>(), "C", 10, techStack4.getTechStackId(), assignment4.getAssignmentId());
        Question question16 = new Question(16, new ArrayList<>(), "A", 10, techStack4.getTechStackId(), assignment4.getAssignmentId());

        // Create results
        List<Result> results = new ArrayList<>();

        // Result for student1 and assignment1
        List<Question> questions1 = new ArrayList<>();
        questions1.add(question1);
        questions1.add(question2);
        questions1.add(question3);
        questions1.add(question4);
        List<Answer> answers1 = new ArrayList<>();
        answers1.add(answer1);
        answers1.add(answer2);
        answers1.add(answer3);
        answers1.add(answer4);
        Result result1 = new Result(1, student1, assignment1, trainer1, 20, null, null);
        results.add(result1);

        // Result for student2 and assignment2
        List<Question> questions2 = new ArrayList<>();
        questions2.add(question5);
        questions2.add(question6);
        questions2.add(question7);
        questions2.add(question8);
        List<Answer> answers2 = new ArrayList<>();
        answers2.add(answer5);
        answers2.add(answer6);
        answers2.add(answer7);
        answers2.add(answer8);
        Result result2 = new Result(1, student2, assignment2, trainer2, 25, null, null);
        results.add(result2);

        // Result for student3 and assignment3
        List<Question> questions3 = new ArrayList<>();
        questions3.add(question9);
        questions3.add(question10);
        questions3.add(question11);
        questions3.add(question12);
        List<Answer> answers3 = new ArrayList<>();
        answers3.add(answer9);
        answers3.add(answer10);
        answers3.add(answer11);
        answers3.add(answer12);
        Result result3 = new Result(1, student3, assignment3, trainer3, 30, null, null);
        results.add(result3);

        // Result for student4 and assignment4
        List<Question> questions4 = new ArrayList<>();
        questions4.add(question13);
        questions4.add(question14);
        questions4.add(question15);
        questions4.add(question16);
        List<Answer> answers4 = new ArrayList<>();
        answers4.add(answer13);
        answers4.add(answer14);
        answers4.add(answer15);
        answers4.add(answer16);
        Result result4 = new Result(1, student4, assignment4, trainer1, 35, null, null);
        results.add(result4);

        for (Result result : results) {
            System.out.println("Student: " + result.getStudent().getName());
            System.out.println("Assignment: " + result.getAssignment().getTitle());
            System.out.println("Trainer: " + result.getTrainer().getName());
            System.out.println("Score: " + result.getScore());
            System.out.println("Feedback: " + result.getFeedback());
            System.out.println("Submission Date: " + result.getSubmissionDate());
            System.out.println();
        }
        // Create ResultsData on the above Data
        ResultsData resultsData = new ResultsData(results);

        System.out.println("Highest Performing Student: " + resultsData.getHighestPerformingStudent().getName());   
        System.out.println("Second Highest Performing Student: " + resultsData.getSecondHighestPerformingStudent().getName());

        System.out.println("Overall Ranking:");
        for (Student student : resultsData.getOverallRanking()) {
            System.out.println(student.getName());
        }

        System.out.println("Students Who Need Improvement:");
        for (Student student : resultsData.getStudentsWhoNeedImprovement()) {
            System.out.println(student.getName());
        }

        System.out.println("Results of student1:");
        for (Result result : resultsData.getResultsByStudent(student1)) {
            System.out.println("Assignment: " + result.getAssignment().getTitle());
            System.out.println("Trainer: " + result.getTrainer().getName());
            System.out.println("Score: " + result.getScore());
            System.out.println("Feedback: " + result.getFeedback());
            System.out.println("Submission Date: " + result.getSubmissionDate());
            System.out.println();
        }

        System.out.println("All Results:");
        for (Result result : resultsData.getResults()) {
            System.out.println("Student: " + result.getStudent().getName());
            System.out.println("Assignment: " + result.getAssignment().getTitle());
            System.out.println("Trainer: " + result.getTrainer().getName());
            System.out.println("Score: " + result.getScore());
            System.out.println("Feedback: " + result.getFeedback());
            System.out.println("Submission Date: " + result.getSubmissionDate());
            System.out.println();
        }
    }
}