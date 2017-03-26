package com.pa;

import com.badlogic.gdx.Game;
import com.screens.MenuScreen;

public class ProjectArrow extends Game {

	@Override
	public void create () {
		Resources.load();
		this.setScreen(new MenuScreen(this));//Обьявляем экран
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}
