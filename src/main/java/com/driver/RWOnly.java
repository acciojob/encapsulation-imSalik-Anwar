package com.driver;

public class RWOnly {
    private String name = "Salik";

    public RWOnly() {

    }

    public void setter(String name){
        this.name = name;
    }
    public String getter(){
        return name;
    }
}
