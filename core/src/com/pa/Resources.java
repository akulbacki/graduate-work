package com.pa;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.scenes.scene2d.ui.List;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Resources {

    public static FreeTypeFontGenerator generator;
    public static TextButton play, journal, help;
    public static Object[] tips = {"Text", "Text"};
    public static List tiptools;
    public static Skin skin;

    public static void load() {
        generator = new FreeTypeFontGenerator(Gdx.files.internal("fonts/RexLight.ttf"));
        FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
    }
}
