package com.counter.assignment.service;

import com.counter.assignment.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Serves {
    @Autowired
    private Repo myrepo;

    public String hitt() {
        myrepo.getMylist().add(1);
        return "hitted";
    }

    public int getcount() {
        return myrepo.getMylist().size();
    }
}
