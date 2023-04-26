package com.example.rockpaperdscissors;
import java.util.Random;

import com.example.rockpaperdscissors.service.ServiceRockPaper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class rockpaper {

    @Autowired
    ServiceRockPaper serviceRockPaper;

    // api endpoint
    @GetMapping("/rockpaper/{userMove}")
    public String game(@PathVariable("userMove") String usermove){
        log.warn("user hit this endpoint");
        return  serviceRockPaper.ComputerMove(usermove);
    }




}
