
public class TechStack {
    private int techStackId;
    private String name;
    private String description;

    // Constructor
    public TechStack(int techStackId, String name, String description) {
        this.techStackId = techStackId;
        this.name = name;
        this.description = description;
    }

    // Getters and setters
    public int getTechStackId() {
        return techStackId;
    }

    public void setTechStackId(int techStackId) {
        this.techStackId = techStackId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // HashCode and equals
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + techStackId;
        result = prime * result + ((description == null) ? 0 : description.hashCode());
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
        TechStack other = (TechStack) obj; // Typecast the object to TechStack
        if (techStackId != other.techStackId) // Compare the techStackId
            return false;
        if (description == null) { // If the description is null
            if (other.description != null) // If the other description is not null
                return false;
        } else if (!description.equals(other.description)) // If the descriptions are not equal
            return false;
        if (name == null) { // If the name is null
            if (other.name != null) // If the other name is not null
                return false;
        } else if (!name.equals(other.name)) // If the names are not equal
            return false;
        return true;
    }
}
