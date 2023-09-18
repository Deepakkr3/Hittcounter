package com.counter.assignment.data;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataSource {
    @Bean
    public List<Integer> getdata()
    {
        return new ArrayList<>();
    }
}
