package com.e.client;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Alien {
    private String id;
    private String name;
    private String tech;
    @Autowired
    private Laptop laptop;

    public void show() {
        System.out.println("in show");
        System.out.println("for laptop object");
        this.laptop.show();
    }

}
