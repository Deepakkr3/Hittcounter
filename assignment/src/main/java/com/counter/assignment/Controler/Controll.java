package com.counter.assignment.Controler;

import com.counter.assignment.service.Serves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controll {
    @Autowired
    private Serves myservis;
    @PostMapping("api/v1/visitor-count-app")
    public String hitt()
    {
        return  myservis.hitt();
    }
    @GetMapping("count")
    public int getcount()
    {
        return myservis.getcount();
    }


}
