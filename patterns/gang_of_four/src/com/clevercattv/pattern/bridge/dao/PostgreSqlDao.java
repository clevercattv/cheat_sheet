package com.clevercattv.pattern.bridge.dao;

public class PostgreSqlDao implements Dao {
    @Override
    public void create(String user) {
        System.out.println("*PostgreSql says* Create " + user);
    }
}
