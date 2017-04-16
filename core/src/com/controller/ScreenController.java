package com.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;
import com.pa.ProjectArrow;

public class ScreenController {
    private ProjectArrow game;
    private Vector3 touchPosition;

    public ScreenController(ProjectArrow game){
        this.game = game;
        touchPosition = new Vector3();
    }

    public boolean isTextureTouched(OrthographicCamera camera, Sprite sprite){
        boolean contain = false;
        if (Gdx.input.isTouched()) {
            Gdx.app.log("isTextureTouched", "Can touch this?");
            touchPosition = camera.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
            if (touchPosition.x > sprite.getX() && touchPosition.x < (sprite.getX() + sprite.getWidth())
                    && touchPosition.y > sprite.getY() && touchPosition.y < (sprite.getY() + sprite.getHeight())) {
                contain = true;
            }
        } else { contain = false; }

        return contain;
    }

}
