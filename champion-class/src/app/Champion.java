package app;

public class Champion {
    private String name;
    private int rank;
    private int score;
    private double kdRate;
    private double hitRate;
    private int ultimateSkillPerGame;
    private boolean isHuman;

    public Champion() {
        this.name = "";
        this.rank = Integer.MIN_VALUE;
        this.score = 0;
        this.kdRate = 0.0;
        this.hitRate = 0.0;
        this.ultimateSkillPerGame = 0;
        this.isHuman = false;
    }

    public Champion(String name, int rank) {
        this.setName(name);
        this.setRank(rank);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean isHuman) {
        this.isHuman = isHuman;
    }

    public double getKdRate() {
        return kdRate;
    }

    public double getHitRate() {
        return hitRate;
    }

    public void setHitRate(double hitRate) {
        this.hitRate = hitRate;
    }

    public void setKdRate(double kdRate) {
        this.kdRate = kdRate;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getUltimateSkillPerGame() {
        return ultimateSkillPerGame;
    }

    public void setUltimateSkillPerGame(int ultimateSkillPerGame) {
        this.ultimateSkillPerGame = ultimateSkillPerGame;
    }

    public String toString() {
        return "Name: " + this.name + "\n" + "Rank: " + this.rank + "\n" + "Score: " + this.score + "\n" + "KD: " + this.kdRate + "\n" + "Hit Rate:" + this.hitRate + "\n" + "每把最多" + this.ultimateSkillPerGame + "个大!";
    }

}
