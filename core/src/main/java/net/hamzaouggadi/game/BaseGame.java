package net.hamzaouggadi.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;

import net.hamzaouggadi.screens.BaseScreen;

public abstract class BaseGame extends Game {

    public static BaseGame game;

    public BaseGame() {
        game = this;
    }

    @Override
    public void create() {
        InputMultiplexer inputMultiplexer = new InputMultiplexer();
        Gdx.input.setInputProcessor(inputMultiplexer);
    }

    public void setActiveScreen(BaseScreen screen) {
        game.setScreen(screen);
    }

}
