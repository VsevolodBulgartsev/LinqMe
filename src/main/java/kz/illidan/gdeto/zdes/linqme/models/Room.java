package kz.illidan.gdeto.zdes.linqme.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vsevolod.bulgartsev on 17.01.2018.
 */
public class Room {

    private long id;
    private int betTimer; //время на написание подсказки
    private int hintTimer; // время на написание стави
    private String name; // название комнаты
    private String password;
    private List<User> users; // Имя пользователя
    private String chatHistory; // чат для пока набираем комнату
    private GameStates gameState; // текущий статус игры
    private List<Round> rounds; // текущий раунд
    private String currentMovingUser; // пользователь, чей ход сейчас

    public Room() {
        this.users = new ArrayList<>();
        this.rounds = new ArrayList<>();
    }

    //<editor-fold desc="getters and setters">

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBetTimer() {
        return betTimer;
    }

    public void setBetTimer(int betTimer) {
        this.betTimer = betTimer;
    }

    public int getHintTimer() {
        return hintTimer;
    }

    public void setHintTimer(int hintTimer) {
        this.hintTimer = hintTimer;
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

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getChatHistory() {
        return chatHistory;
    }

    public void setChatHistory(String chatHistory) {
        this.chatHistory = chatHistory;
    }

    public GameStates getGameState() {
        return gameState;
    }

    public void setGameState(GameStates gameState) {
        this.gameState = gameState;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public String getCurrentMovingUser() {
        return currentMovingUser;
    }

    public void setCurrentMovingUser(String currentMovingUser) {
        this.currentMovingUser = currentMovingUser;
    }

    //</editor-fold>
}
