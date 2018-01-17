package kz.illidan.gdeto.zdes.linqme.models;

import java.util.List;

/**
 * Created by vsevolod.bulgartsev on 17.01.2018.
 */
public class Round {
    private List<Hint> hints; // подсказки в раунде
    private List<Bet> bets; // ставки в раунде
    private int currentRoundStageNumber; //номер кона
//    private Map<User, Word>; // соотношение игрока и слова


    public List<Hint> getHints() {
        return hints;
    }

    public void setHints(List<Hint> hints) {
        this.hints = hints;
    }

    public List<Bet> getBets() {
        return bets;
    }

    public void setBets(List<Bet> bets) {
        this.bets = bets;
    }

    public int getCurrentRoundStageNumber() {
        return currentRoundStageNumber;
    }

    public void setCurrentRoundStageNumber(int currentRoundStageNumber) {
        this.currentRoundStageNumber = currentRoundStageNumber;
    }
}
