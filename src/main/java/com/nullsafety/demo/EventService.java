package com.nullsafety.demo;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @NonNull
    public String createEvent(@NonNull String name){
        return name;
    }
}
