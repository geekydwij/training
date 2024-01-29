
public class Answer {
    private int answerId;
    private String answerText;

    // Constructor
    public Answer(int answerId, String answerText) {
        this.answerId = answerId;
        this.answerText = answerText;
    }

    // Getters and setters
    public int getAnswerId() {
        return answerId;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + answerId;
        result = prime * result + ((answerText == null) ? 0 : answerText.hashCode());
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
        Answer other = (Answer) obj; // Typecast the object to Answer
        if (answerId != other.answerId) // Compare the answerId
            return false;
        if (answerText == null) { // If the answerText is null
            if (other.answerText != null) // If the other answerText is not null
                return false;
        } else if (!answerText.equals(other.answerText)) // If the answerTexts are not equal
            return false;
        return true;
    }
}
