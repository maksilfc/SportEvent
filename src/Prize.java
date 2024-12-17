public class Prize {
    private int id;
    private double money;
    private String place;

    public Prize() {}

    public Prize(int id, double money, String place) {
        this.id = id;
        this.money = money;
        this.place = place;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getMoney() { return money; }
    public void setMoney(double money) { this.money = money; }
    public String getPlace() { return place; }
    public void setPlace(String place) { this.place = place; }

    @Override
    public String toString() {
        return "Prize [id=" + id + ", money=" + money + ", place=" + place + "]";
    }
}
