
import java.util.*;

public class Trainer {
    private int trainerId;
    private String name;
    private String email;
    private String contactNumber;
    private List<TechStack> techStacks;

    // Constructor
    public Trainer(int trainerId, String name, String email, String contactNumber, List<TechStack> techStacks) {
        this.trainerId = trainerId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.techStacks = techStacks;
    }

    // Getters and setters
    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
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

    public List<TechStack> getTechStacks() {
        return techStacks;
    }

    public void setTechStacks(List<TechStack> techStacks) {
        this.techStacks = techStacks;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + trainerId;
        result = prime * result + ((contactNumber == null) ? 0 : contactNumber.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((techStacks == null) ? 0 : techStacks.hashCode());
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
        Trainer other = (Trainer) obj; // Typecast the object to Trainer
        if (trainerId != other.trainerId) // Compare the trainerId
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
        if (techStacks == null) { // If the techStacks is null
            if (other.techStacks != null) // If the other techStacks is not null
                return false;
        } else if (!techStacks.equals(other.techStacks)) // If the techStacks are not equal
            return false;
        return true;
    }
}
