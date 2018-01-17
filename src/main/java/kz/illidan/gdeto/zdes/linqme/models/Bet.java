package kz.illidan.gdeto.zdes.linqme.models;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by vsevolod.bulgartsev on 17.01.2018.
 */
public class Bet {

    private String userName;
    private Map<String, String> bet1 = new HashMap<String, String>(); //Первая ставка
    private Map<String, String> bet2 = new HashMap<String, String>(); // Вторая ставка
//    bet1.put("Иван","Дно");
//    bet1.put("Рус","Ракал");
//    bet2.put("Иван","Дотер");
//    bet2.put("Рус","Морской житель");

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Map<String, String> getBet1() {
        return bet1;
    }

    public void setBet1(Map<String, String> bet1) {
        this.bet1 = bet1;
    }

    public Map<String, String> getBet2() {
        return bet2;
    }

    public void setBet2(Map<String, String> bet2) {
        this.bet2 = bet2;
    }

}
