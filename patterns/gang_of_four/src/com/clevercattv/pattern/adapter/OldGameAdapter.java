package com.clevercattv.pattern.adapter;

import com.clevercattv.pattern.adapter.game.Game;
import com.clevercattv.pattern.adapter.game.OldGame;

public class OldGameAdapter extends Game {
    OldGame oldGame;

    public OldGameAdapter(OldGame oldGame) {
        this.oldGame = oldGame;
    }

    @Override
    public void playMusic() {
        oldGame.makeNoise();
    }
}
