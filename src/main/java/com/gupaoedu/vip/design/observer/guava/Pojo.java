package com.gupaoedu.vip.design.observer.guava;

/**
 * Created by Tom.
 */
public class Pojo {
    private String name;

    public Pojo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
