import java.util.*;

public class Answer {
    private int answerId;
    private List<String> options;

    // Constructor
    public Answer(int answerId, List<String> options) {
        this.answerId = answerId;
        this.options = options;
    }

    // Getters and setters
    public int getAnswerId() {
        return answerId;
    }
    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

}