package kz.illidan.gdeto.zdes.linqme;

import kz.illidan.gdeto.zdes.linqme.models.Room;
import kz.illidan.gdeto.zdes.linqme.models.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by vsevolod.bulgartsev on 18.01.2018.
 */

@Component
public class Game {

    private List<Room> rooms;
    private List<User> users;
    private Set<String> words;

    public Game() {
        this.rooms = new ArrayList<>();
        this.users = new ArrayList<>();

        this.words = new HashSet<>();
        words.add("Печенька");
        words.add("Чай");
        words.add("Ноутбук");
        words.add("Клава");
        words.add("Мышка");
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Set<String> getWords() {
        return words;
    }

    public void setWords(Set<String> words) {
        this.words = words;
    }
}
