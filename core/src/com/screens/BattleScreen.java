package com.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.controller.BattleController;
import com.entities.BattleSides;
import com.pa.ProjectArrow;

public class BattleScreen implements Screen {
    ProjectArrow game;
    BattleSides entities;
    BattleRenderer renderer;
    BattleController controller;

    BattleScreen(ProjectArrow game){
        this.game = game;
        entities = new BattleSides();
        renderer = new BattleRenderer(entities);
        controller = new BattleController(entities);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        entities.update(delta);
        renderer.render();
        controller.turnListener();
    }

    @Override
    public void resize(int width, int height) {
        renderer.resize(width, height);
    }

    @Override
    public void pause() { Gdx.app.log("Menu","pause called"); }

    @Override
    public void resume() { Gdx.app.log("Menu","resume called"); }

    @Override
    public void hide() { Gdx.app.log("Menu","hide called"); }

    @Override
    public void dispose() {
        renderer.dispose();
    }
}
