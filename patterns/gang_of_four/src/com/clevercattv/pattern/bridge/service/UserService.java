package com.clevercattv.pattern.bridge.service;

import com.clevercattv.pattern.bridge.dao.Dao;

public class UserService {

    private Dao dao;

    public UserService(Dao dao) {
        this.dao = dao;
    }

    public void createUser(String user) {
        // do some important things, maybe invalidate user..
        //
        // create user using injected DAO (so we have no need to create different services for different DAO)
        dao.create(user);
    }

    // we can switch implementation in runtime
    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
