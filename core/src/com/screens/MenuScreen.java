package com.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.pa.ProjectArrow;

public class MenuScreen implements Screen {
    final ProjectArrow game;

    public MenuScreen(ProjectArrow game) {
        this.game = game;
        Gdx.app.log("Menu","created");
    }

    @Override
    public void show() { Gdx.app.log("Menu","show called"); }

    @Override
    public void render(float delta) {}

    @Override
    public void resize(int width, int height) { Gdx.app.log("Menu","resize called"); }

    @Override
    public void pause() { Gdx.app.log("Menu","pause called"); }

    @Override
    public void resume() { Gdx.app.log("Menu","resume called"); }

    @Override
    public void hide() { Gdx.app.log("Menu","hide called"); }

    @Override
    public void dispose() { Gdx.app.log("Menu","dispose called");  }

}
