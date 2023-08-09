package com.driver;

public class Main {
    public static void main(String[] args) {
//        RWOnly obj = new RWOnly("Accio");
//        System.out.println(obj.name);
//        Erro: java: name has private access in com.driver.RWOnly

        RWOnly obj = new RWOnly();
        obj.setter("Accio");
        System.out.println(obj.getter());

    }
}