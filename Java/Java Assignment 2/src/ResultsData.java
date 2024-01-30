
import java.util.*;

class ResultsData {
    private List<Result> results;

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

    // Other methods
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

    // create a method to Find the highest performing Student by adding all techStackmarks and finding percentages.
    public Student getHighestPerformingStudent() {
        Student highestPerformingStudent = null;
        int highestScore = 0;
        for (Result result : results) {
            if (result.getScore() > highestScore) {
                highestScore = result.getScore();
                highestPerformingStudent = result.getStudent();
            }
        }
        return highestPerformingStudent;
    }

    // create a method to Find the second-highest student by adding all techStack(Subjects) marks/Assignments and finding percentages.
    public Student getSecondHighestPerformingStudent() {
        Student highestPerformingStudent = getHighestPerformingStudent();
        Student secondHighestPerformingStudent = null;
        int secondHighestScore = 0;
        for (Result result : results) {
            if (result.getScore() > secondHighestScore && !result.getStudent().equals(highestPerformingStudent)) {
                secondHighestScore = result.getScore();
                secondHighestPerformingStudent = result.getStudent();
            }
        }
        return secondHighestPerformingStudent;
    }

    // Create a method to find the overall ranking of students by Scores.
    public List<Student> getOverallRanking() {
        List<Student> overallRanking = new ArrayList<>();
        for (Result result : results) {
            overallRanking.add(result.getStudent());
        }
        Collections.sort(overallRanking, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return getResultsByStudent(student2).get(0).getScore() - getResultsByStudent(student1).get(0).getScore();
            }
        });
        return overallRanking;
    }

    // Get all the Students who need improvements and scored less than 60%.
    public List<Student> getStudentsWhoNeedImprovement() {
        List<Student> studentsWhoNeedImprovement = new ArrayList<>();
        for (Result result : results) {
            if (result.getScore() < 60) {
                studentsWhoNeedImprovement.add(result.getStudent());
            }
        }
        return studentsWhoNeedImprovement;
    }
    
}
