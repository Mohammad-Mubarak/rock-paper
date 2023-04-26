package com.example.rockpaperdscissors.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;
@Slf4j
@Service
public class ServiceRockPaper {


    public  String ComputerMove(String userMove){

        String moveArray[] = {"empty","rock","paper","scissor"};
        Random random = new Random();

        log.info("computer move is =>"+random);


// generate a random number between 1 and 3
        int randomNumber = random.nextInt(3) + 1;

        if (userMove.equals("rock") && moveArray[randomNumber].equals("scissor")) {
            return "Player wins";
        } else if (userMove.equals("paper") && moveArray[randomNumber].equals("rock")) {
            return "Player wins";
        } else if (userMove.equals("scissor") && moveArray[randomNumber].equals("paper")) {
            return "Player wins";
        } else if (userMove.equals(moveArray[randomNumber])) {
            return "It's a tie!";
        } else {
            return "Computer wins";
        }


    }
}
