package com.design.patterns.singleton;

public class HungrySingleton {
    private static final HungrySingleton SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return SINGLETON;
    }
}
