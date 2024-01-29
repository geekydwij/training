
import java.util.*;

class ResultsData {
    private List<Result> results;

    public void addResult(Result result) {
        results.add(result);
    }

    public List<Result> getResultsByStudent(Student student) {
        List<Result> studentResults = new ArrayList<>();
        for (Result result : results) {
            if (result.getStudent().equals(student)) {
                studentResults.add(result);
            }
        }
        return studentResults;
    }

    // Other methods

    // Constructor
    public ResultsData(List<Result> results) {
        this.results = results;
    }

    // Getters and setters
    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
