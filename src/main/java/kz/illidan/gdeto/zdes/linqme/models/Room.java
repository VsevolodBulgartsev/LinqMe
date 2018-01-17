package kz.illidan.gdeto.zdes.linqme.models;

import java.util.List;

/**
 * Created by vsevolod.bulgartsev on 17.01.2018.
 */
public class Room {

    private long id;
    private int timer1; //время на написание подсказки
    private int timer2; // хз
    private String name; // название комнаты
    private String password;
    private List<User> User; // Имя пользователя
    private String chatHistory; // чат для пока набираем комнату
//    private GameState state; // кажется, для того чтобы начать игру статус
    private List<Round> round; // текущий раунт
    private String currentMovingUser; // пользователь, чей ход сейчас

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getTimer1() {
        return timer1;
    }

    public void setTimer1(int timer1) {
        this.timer1 = timer1;
    }

    public int getTimer2() {
        return timer2;
    }

    public void setTimer2(int timer2) {
        this.timer2 = timer2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<kz.illidan.gdeto.zdes.linqme.models.User> getUser() {
        return User;
    }

    public void setUser(List<kz.illidan.gdeto.zdes.linqme.models.User> user) {
        User = user;
    }

    public String getChatHistory() {
        return chatHistory;
    }

    public void setChatHistory(String chatHistory) {
        this.chatHistory = chatHistory;
    }

    public List<Round> getRound() {
        return round;
    }

    public void setRound(List<Round> round) {
        this.round = round;
    }

    public String getCurrentMovingUser() {
        return currentMovingUser;
    }

    public void setCurrentMovingUser(String currentMovingUser) {
        this.currentMovingUser = currentMovingUser;
    }
}
