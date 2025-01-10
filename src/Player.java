public class Player {
    private int id;
    private String name;
    private int age;
    private String nationality;
    private double winRate;
    private int highestRanking;
    private Club club;

    public Player() {
    }

    public Player(int id, String name, int age, String nationality, double winRate, int highestRanking, Club club) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.winRate = winRate;
        this.highestRanking = highestRanking;
        this.club = club;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getWinRate() {
        return winRate;
    }

    public void setWinRate(double winRate) {
        this.winRate = winRate;
    }

    public int getHighestRanking() {
        return highestRanking;
    }

    public void setHighestRanking(int highestRanking) {
        this.highestRanking = highestRanking;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                ", winRate=" + winRate +
                ", highestRanking=" + highestRanking +
                ", club=" + club +  // Displaying the club object
                '}';
    }
}