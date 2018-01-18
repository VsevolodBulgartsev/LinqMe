package kz.illidan.gdeto.zdes.linqme.models;

/**
 * Created by vsevolod.bulgartsev on 17.01.2018.
 */
public class User {
    private String name;
    private int totalPoints; //итого очков у игрока

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

}


