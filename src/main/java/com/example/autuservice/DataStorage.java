package com.example.autuservice;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {
    private static DataStorage instance;
    private final List<User> users;
    private final List<Service> services;

    private DataStorage() {
        users = new ArrayList<>();
        users.add(new User("a", "a", "a", "a", "a", User.Gender.FEMALE));

        services = new ArrayList<>();
    }

    public static DataStorage getInstance() {
        if (instance == null) {
            instance = new DataStorage();
        }

        return instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Service> getServices() {
        return services;
    }
}
