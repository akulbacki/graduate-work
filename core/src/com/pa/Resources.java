package com.pa;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.List;

public class Resources {

    public static FreeTypeFontGenerator generator;
    public static Object[] tips = {"Text", "Text"};
    public static List tiptools;

    public static Sprite startGameBtn, codexBtn, optionBtn;
    public static Texture bg, facArrow, facGideon;

    public static Sprite player, enemy;

    public static void load() {

        startGameBtn =  new Sprite(new Texture("startbtn.png"));
        codexBtn = new Sprite(new Texture("codexbtn.png"));
        optionBtn = new Sprite(new Texture("optionbtn.png"));
        bg = new Texture("background.jpg");
        facArrow = new Texture("faction_arrow.png");
        facGideon = new Texture("faction_gideon.png");

        player = new Sprite(new Texture("ship1.png"));
        enemy = new Sprite(new Texture("ship2.png"));
    }

    public static void dispose() {
    }
}
