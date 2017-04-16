package com.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.entities.BattleSides;
import com.pa.ProjectArrow;
import com.pa.Resources;

public class BattleRenderer {
    BattleSides entities;
    OrthographicCamera camera;
    Stage stage;
    SpriteBatch batch;
    Vector3 vectorXYZ;

    public BattleRenderer(BattleSides entities){
        this.entities = entities;
        camera = new OrthographicCamera();
        camera.setToOrtho(false);
        camera.update();

        batch = new SpriteBatch();
        vectorXYZ = new Vector3();
        stage = new Stage();
        stage.addActor(entities.getEnemy());
        stage.addActor(entities.getPlayer());
    }

    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();
        batch.begin();
        batch.draw(Resources.bg, 0, 0, ProjectArrow.WIDTH, ProjectArrow.HEIGHT);
        batch.end();

        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    public void resize(int width, int height){
        stage.getViewport().update(width, height, false);
    }

    public void dispose(){
        stage.dispose();
    }

}
