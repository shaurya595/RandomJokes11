package com.Geekster.RandomJokes.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class JokesController {
   static ArrayList<String> JokesList = new ArrayList<>();

    @PostMapping (value = "/jokess")
    public String SetJokes(@RequestBody String jokes ){
        JokesList.add(jokes);

        return "saved Jokes";
    }
    @GetMapping (value = "/jokess")
    public String getJokes(){
        int randomNumber = 0+(int)(Math.random() *( (4-0) +1));
        return JokesList.get(randomNumber);
    }

}
