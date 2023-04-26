package com.example.rockpaperdscissors.service;

import org.springframework.stereotype.Service;

import java.util.Random;
@Service
public class ServiceRockPaper {


    public  String ComputerMove(String userMove){

        String moveArray[] = {"empty","rock","paper","scissor"};
        Random random = new Random();

        // generate a random number between 1 and 3
        int randomNumber = random.nextInt(3) + 1;

        if (userMove.equals("rock") && moveArray[randomNumber].equals("scissor")) {
            return "you win";
        } else if (userMove.equals("paper") && moveArray[randomNumber].equals("rock")) {
            return "you win";
        } else if (userMove.equals("scissor") && moveArray[randomNumber].equals("paper")) {
            return "you win";
        } else {
            return "you lose";
        }
    }
}
