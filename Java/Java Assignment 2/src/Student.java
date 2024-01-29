
public class Student {
    private int studentId;
    private String name;
    private String email;
    private String contactNumber;

    // Constructor
    public Student(int studentId, String name, String email, String contactNumber) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters and setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + studentId;
        result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
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
        Student other = (Student) obj; // Typecast the object to Student
        if (studentId != other.studentId) // Compare the studentId
            return false;
        if (contactNumber == null) { // If the contactNumber is null
            if (other.contactNumber != null) // If the other contactNumber is not null
                return false;
        } else if (!contactNumber.equals(other.contactNumber)) // If the contactNumbers are not equal
            return false;
        if (email == null) { // If the email is null
            if (other.email != null) // If the other email is not null
                return false;
        } else if (!email.equals(other.email)) // If the emails are not equal
            return false;
        if (name == null) { // If the name is null
            if (other.name != null) // If the other name is not null
                return false;
        } else if (!name.equals(other.name)) // If the names are not equal
            return false;
        return true;
    }
}
