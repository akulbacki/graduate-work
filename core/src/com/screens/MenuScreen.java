package com.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.controller.ScreenController;
import com.pa.ProjectArrow;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.pa.Resources;


public class MenuScreen implements Screen {
    private ProjectArrow game;
    private SpriteBatch batch;
    private Viewport viewport;
    private OrthographicCamera camera;
    private Stage stage;
    ScreenController manager;

    public MenuScreen(ProjectArrow game) {
        this.game = game;
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        camera.update();
        viewport = new FitViewport(ProjectArrow.WIDTH, ProjectArrow.HEIGHT, camera);
        viewport.apply();
        manager = new ScreenController(game);
        stage = new Stage(new StretchViewport(ProjectArrow.WIDTH, ProjectArrow.HEIGHT));

        batch = new SpriteBatch();
        Resources.startGameBtn.setPosition(210,65);
        Resources.codexBtn.setPosition(425,80);
        Resources.optionBtn.setPosition(10,80);


        Gdx.app.log("Menu","created");
    }

    @Override
    public void show() { Gdx.app.log("Menu","show called"); }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor( 1.0f, 1.0f, 1.0f, 1.0f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        batch.begin();
        batch.draw(Resources.bg, 0, 0, ProjectArrow.WIDTH, ProjectArrow.HEIGHT);
        Resources.startGameBtn.draw(batch);
        Resources.codexBtn.draw(batch);
        Resources.optionBtn.draw(batch);
        batch.end();
        stage.draw();

        touchListener();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height);
        stage.getViewport().update(width, height, false);
        Gdx.app.log("Menu","resize called");
    }

    @Override
    public void pause() { Gdx.app.log("Menu","pause called"); }

    @Override
    public void resume() { Gdx.app.log("Menu","resume called"); }

    @Override
    public void hide() { Gdx.app.log("Menu","hide called"); }

    @Override
    public void dispose() {
        stage.dispose();
        Gdx.app.log("Menu","dispose called");
    }

    public void touchListener(){
        if(manager.isTextureTouched(camera, Resources.startGameBtn)){
            dispose();
            game.setScreen(new BattleScreen(game));
        } else if(manager.isTextureTouched(camera, Resources.codexBtn)){
            dispose();
            game.setScreen(new CodexScreen(game));
        } else if(manager.isTextureTouched(camera, Resources.optionBtn)){
            dispose();
            game.setScreen(new OptionsScreen(game));
        }
    }

}
