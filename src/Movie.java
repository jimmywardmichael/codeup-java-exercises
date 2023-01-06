package movies;
public class Movie {
    // Private fields for name and category
    private String name;
    private String category;

    // Constructor that sets both the name and category fields
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the category field
    public String getCategory() {
        return category;
    }

    // Setter method for the category field
    public void setCategory(String category) {
        this.category = category;
    }
}
