import java.util.List;

public class Federation {
    private int id;
    private String name;
    private String presidentName;
    private int boardMembersNumber;
    private int yearOfCreation;
    private double funding;
    private List<Contest> contestsOrganized;

    public Federation() {}

    public Federation(int id, String name, String presidentName, int boardMembersNumber, int yearOfCreation, double funding) {
        this.id = id;
        this.name = name;
        this.presidentName = presidentName;
        this.boardMembersNumber = boardMembersNumber;
        this.yearOfCreation = yearOfCreation;
        this.funding = funding;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPresidentName() { return presidentName; }
    public void setPresidentName(String presidentName) { this.presidentName = presidentName; }
    public int getBoardMembersNumber() { return boardMembersNumber; }
    public void setBoardMembersNumber(int boardMembersNumber) { this.boardMembersNumber = boardMembersNumber; }
    public int getYearOfCreation() { return yearOfCreation; }
    public void setYearOfCreation(int yearOfCreation) { this.yearOfCreation = yearOfCreation; }
    public double getFunding() { return funding; }
    public void setFunding(double funding) { this.funding = funding; }
    public List<Contest> getContestsOrganized() { return contestsOrganized; }
    public void setContestsOrganized(List<Contest> contestsOrganized) { this.contestsOrganized = contestsOrganized; }
}
