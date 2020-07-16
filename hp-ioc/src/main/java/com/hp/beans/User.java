package com.hp.beans;

/**
 * @author haopeng
 * @date 2020-07-16 10:02
 */
public class User {
    private String name;

    public void sayHello() {
        System.out.println("hello: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
