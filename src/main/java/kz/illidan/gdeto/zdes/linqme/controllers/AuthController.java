package kz.illidan.gdeto.zdes.linqme.controllers;

import com.sun.org.apache.xpath.internal.operations.Equals;
import kz.illidan.gdeto.zdes.linqme.Game;
import kz.illidan.gdeto.zdes.linqme.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vsevolod.bulgartsev on 18.01.2018.
 */

@RestController
public class AuthController {
    private final Game game;

    @Autowired
    public AuthController(Game game) {
        this.game = game;
    }

    @RequestMapping("/login")
    public String login(@RequestParam("userName") String userName) {
        for (User user : game.getUsers()) {
            if (user.getName().equals(userName)) {
                return "Такой пользователь уже зарегестрирован";
            }
        }

        User newUser = new User();
        newUser.setName(userName);

        game.getUsers().add(newUser);

        return "Добро пожаловать";
    }
}
