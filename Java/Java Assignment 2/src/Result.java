
import java.util.*;

public class Result {
    private Student student;
    private Assignment assignment;
    private List<Question> questions;
    private List<Answer> answers;
    private int score;

    public Result(Student student, Assignment assignment, List<Question> questions, List<Answer> answers, int score) {
        this.student = student;
        this.assignment = assignment;
        this.questions = questions;
        this.answers = answers;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
