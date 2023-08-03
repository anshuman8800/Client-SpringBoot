package com.e.client;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Laptop {
    private String id;
    private String name;

    public void show() {
        System.out.println("show laptop details");
    }
}
