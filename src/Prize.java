public class Prize {
    private int id;
    private int place;
    private double moneyPrize;

    public Prize(int id, int place, double moneyPrize) {
        this.id = id;
        this.place = place;
        this.moneyPrize = moneyPrize;
    }

    public int getId() {
        return id;
    }

    public int getPlace() {
        return place;
    }

    public double getMoneyPrize() {
        return moneyPrize;
    }

    @Override
    public String toString() {
        return "Prize{id=" + id + ", place=" + place + ", moneyPrize=" + moneyPrize + "}";
    }
}