public class Contest {
    private int id;
    private String name;
    private double entryFee;
    private String startingDate; // Simplified as a String
    private int duration;
    private String location;
    private Type type;
    private Category category;

    public Contest(int id, String name, double entryFee, String startingDate, int duration, String location, Type type, Category category) {
        this.id = id;
        this.name = name;
        this.entryFee = entryFee;
        this.startingDate = startingDate;
        this.duration = duration;
        this.location = location;
        this.type=type;
        this.category=category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEntryFee() {
        return entryFee;
    }

    public void setEntryFee(double entryFee) {
        this.entryFee = entryFee;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Contest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", entryFee=" + entryFee +
                ", startingDate='" + startingDate + '\'' +
                ", duration=" + duration +
                ", location='" + location + '\'' +
                ", type=" + type +
                ", category=" + category +
                '}';
    }
}

