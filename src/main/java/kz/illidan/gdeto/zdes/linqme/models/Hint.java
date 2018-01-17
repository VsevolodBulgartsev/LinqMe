package kz.illidan.gdeto.zdes.linqme.models;

/**
 * Created by vsevolod.bulgartsev on 17.01.2018.
 */
public class Hint {
    private String userName;
    private String hint1; // первая подсказка
    private String hint2; // вторая подсказка

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getHint1() {
        return hint1;
    }

    public void setHint1(String hint1) {
        this.hint1 = hint1;
    }

    public String getHint2() {
        return hint2;
    }

    public void setHint2(String hint2) {
        this.hint2 = hint2;
    }
}
