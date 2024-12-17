public class Player {
    private int id;
    private String name;
    private int age;
    private String nationality;
    private double winRate;
    private int highestRanking;

    public Player() {}

    public Player(int id, String name, int age, String nationality, double winRate, int highestRanking) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.winRate = winRate;
        this.highestRanking = highestRanking;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public double getWinRate() { return winRate; }
    public void setWinRate(double winRate) { this.winRate = winRate; }
    public int getHighestRanking() { return highestRanking; }
    public void setHighestRanking(int highestRanking) { this.highestRanking = highestRanking; }
}
