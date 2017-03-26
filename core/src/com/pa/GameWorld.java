package com.pa;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Stage;

import java.util.Random;

public class GameWorld {
    GameWorld world; //Мир который надо отрисовать
    Random random;
    OrthographicCamera cam;
    SpriteBatch batch;
    int coordX, coordY, arrCoordX[], arrCoordY[];
    Stage stage;
    Vector3 vectorXYZ;
}
