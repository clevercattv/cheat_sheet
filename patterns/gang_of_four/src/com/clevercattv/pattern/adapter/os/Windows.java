package com.clevercattv.pattern.adapter.os;

import com.clevercattv.pattern.adapter.game.Game;

public class Windows {
    private Game game;

    public Windows(Game game) {
        this.game = game;
    }

    public void launchVideoGame() {
        game.playMusic();
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
