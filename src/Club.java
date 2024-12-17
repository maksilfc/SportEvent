import java.util.List;

public class Club {
    private int id;
    private String name;
    private String managerName;
    private String phoneNumber;
    private String address;
    private List<Contest> contestsHosted;

    public Club() {}

    public Club(int id, String name, String managerName, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.managerName = managerName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getManagerName() { return managerName; }
    public void setManagerName(String managerName) { this.managerName = managerName; }
    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public List<Contest> getContestsHosted() { return contestsHosted; }
    public void setContestsHosted(List<Contest> contestsHosted) { this.contestsHosted = contestsHosted; }
}
