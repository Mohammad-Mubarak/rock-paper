package com.example.rockpaperdscissors;
import java.util.Random;

import com.example.rockpaperdscissors.service.ServiceRockPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rockpaper {

    @Autowired
    ServiceRockPaper serviceRockPaper;

    // api endpoint
    @GetMapping("/rockpaper/{userMove}")
    public String game(@PathVariable("userMove") String usermove){
        return  serviceRockPaper.ComputerMove(usermove);
    }




}
