package com.dimitriskaitantzidis.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

    @Override
    public String getFortunne() {
        return "Today is your lucky day!";
    }
}
