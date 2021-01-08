package com.clevercattv.pattern.bridge.dao;

public class MySqlDao implements Dao {
    @Override
    public void create(String user) {
        System.out.println("*MySql says* Create " + user);
    }
}
