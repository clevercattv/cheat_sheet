package com.clevercattv.pattern.bridge;

import com.clevercattv.pattern.bridge.dao.MySqlDao;
import com.clevercattv.pattern.bridge.dao.PostgreSqlDao;
import com.clevercattv.pattern.bridge.service.UserService;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService(new MySqlDao());
        service.createUser("Test user 1");

        service.setDao(new PostgreSqlDao());
        service.createUser("Test user 2");
    }
}
