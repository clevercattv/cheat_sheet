package com.clevercattv.pattern.adapter;

import com.clevercattv.pattern.adapter.game.Game;
import com.clevercattv.pattern.adapter.game.OldGame;
import com.clevercattv.pattern.adapter.os.Windows;

public class Main {
    public static void main(String[] args) {
        Windows windows = new Windows(new Game());
        windows.launchVideoGame();

//        windows.setGame(new OldGame());  // Didn't work. Different interfaces
        windows.setGame(new OldGameAdapter(new OldGame())); // using adapter
        windows.launchVideoGame();
    }

}
