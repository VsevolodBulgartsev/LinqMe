package kz.illidan.gdeto.zdes.linqme.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vsevolod.bulgartsev on 17.01.2018.
 */
public class Round {
    private Map<User, String> hints1; // подсказки 1 в раунде
    private Map<User, String> hints2; // подсказки 2 в раунде
    private Map<User, Bet> bets1; // ставки 1 в раунде
    private Map<User, Bet> bets2; // ставки 2 в раунде
    private int currentRoundStageNumber; //номер кона
    private Map<User, String> userWords; // соотношение игрока и слова


    public Round() {
        this.hints1 = new HashMap<>();
        this.hints2 = new HashMap<>();
        this.bets1 = new HashMap<>();
        this.bets2 = new HashMap<>();
        this.currentRoundStageNumber = 1;
        this.userWords = new HashMap<>();
    }

    //<editor-fold desc="getters and setters">


    public Map<User, String> getHints1() {
        return hints1;
    }

    public void setHints1(Map<User, String> hints1) {
        this.hints1 = hints1;
    }

    public Map<User, String> getHints2() {
        return hints2;
    }

    public void setHints2(Map<User, String> hints2) {
        this.hints2 = hints2;
    }

    public Map<User, Bet> getBets1() {
        return bets1;
    }

    public void setBets1(Map<User, Bet> bets1) {
        this.bets1 = bets1;
    }

    public Map<User, Bet> getBets2() {
        return bets2;
    }

    public void setBets2(Map<User, Bet> bets2) {
        this.bets2 = bets2;
    }

    public int getCurrentRoundStageNumber() {
        return currentRoundStageNumber;
    }

    public void setCurrentRoundStageNumber(int currentRoundStageNumber) {
        this.currentRoundStageNumber = currentRoundStageNumber;
    }

    public Map<User, String> getUserWords() {
        return userWords;
    }

    public void setUserWords(Map<User, String> userWords) {
        this.userWords = userWords;
    }
    //</editor-fold>
}
