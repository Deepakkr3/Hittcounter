package com.counter.assignment.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Repo {
    @Autowired
    List<Integer> mylist;
    public List<Integer> getMylist()
    {
        return mylist;
    }
}
