public class ContestPlayer {
    private Contest contest;
    private Player player;

    public ContestPlayer(Contest contest, Player player) {
        this.contest = contest;
        this.player = player;
    }

    public Contest getContest() { return contest; }
    public void setContest(Contest contest) { this.contest = contest; }

    public Player getPlayer() { return player; }
    public void setPlayer(Player player) { this.player = player; }

    @Override
    public String toString() {
        return "ContestPlayer{" +
                "contest=" + contest +
                ", player=" + player +
                '}';
    }
}