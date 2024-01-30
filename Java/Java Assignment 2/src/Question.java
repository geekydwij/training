
import java.util.*;

public class Question {
    private int questionId;
    private List<Answer> options;
    private String answerKey;
    private int score;
    private int techStackId;
    private int assignmentId;

    // Constructor
    public Question(int questionId, List<Answer> options, String answerKey, int score, int techStackId,
            int assignmentId) {
        this.questionId = questionId;
        this.options = options;
        this.answerKey = answerKey;
        this.score = score;
        this.techStackId = techStackId;
        this.assignmentId = assignmentId;
    }

    // Getters and setters
    public int getQuestionId() {
        return questionId;
    }

    public List<Answer> getoptions() {
        return options;
    }

    public String getAnswerKey() {
        return answerKey;
    }

    public int getScore() {
        return score;
    }

    public int getTechStackId() {
        return techStackId;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setoptions(List<Answer> options) {
        this.options = options;
    }

    public void setAnswerKey(String answerKey) {
        this.answerKey = answerKey;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + questionId;
        result = prime * result + ((answerKey == null) ? 0 : answerKey.hashCode());
        result = prime * result + ((options == null) ? 0 : options.hashCode());
        result = prime * result + assignmentId;
        result = prime * result + score;
        result = prime * result + techStackId;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both objects are same
            return true;
        if (obj == null) // If the object is null
            return false;
        if (getClass() != obj.getClass()) // If the classes are different
            return false;
        Question other = (Question) obj; // Typecast the object to Question
        if (questionId != other.questionId) // Compare the questionId
            return false;
        if (answerKey == null) { // If the answerKey is null
            if (other.answerKey != null) // If the other answerKey is not null
                return false;
        } else if (!answerKey.equals(other.answerKey)) // If the answerKeys are not equal
            return false;
        if (options == null) { // If the options is null
            if (other.options != null) // If the other options is not null
                return false;
        } else if (!options.equals(other.options)) // If the options are not equal
            return false;
        if (assignmentId != other.assignmentId) // If the assignmentIds are not equal
            return false;
        if (score != other.score) // If the scores are not equal
            return false;
        if (techStackId != other.techStackId) // If the techStackIds are not equal
            return false;
        return true;
    }
}
