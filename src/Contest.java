import java.util.Date;
import java.util.List;

public class Contest {
    private int id;
    private String name;
    private double entryFee;
    private Date startDate;
    private int duration; // In days
    private String location;
    private List<Player> players;
    private List<Prize> prizes;

    public Contest() {}

    public Contest(int id, String name, double entryFee, Date startDate, int duration, String location) {
        this.id = id;
        this.name = name;
        this.entryFee = entryFee;
        this.startDate = startDate;
        this.duration = duration;
        this.location = location;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getEntryFee() { return entryFee; }
    public void setEntryFee(double entryFee) { this.entryFee = entryFee; }
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }
    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public List<Player> getPlayers() { return players; }
    public void setPlayers(List<Player> players) { this.players = players; }
    public List<Prize> getPrizes() { return prizes; }
    public void setPrizes(List<Prize> prizes) { this.prizes = prizes; }
}
