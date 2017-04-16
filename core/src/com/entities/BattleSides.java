package com.entities;

import com.pa.Resources;

public class BattleSides {
    public Ship enemy;
    public Player player;
    static float DEFAULT_HP = 1000,DEFAULT_DMG = 10,DEFAULT_DEF = 10;

    public BattleSides(){
        enemy = new Ship(Resources.enemy, DEFAULT_DMG, DEFAULT_HP, DEFAULT_DEF, 490, 200);
        player = new Player(Resources.player, DEFAULT_DMG + 2, DEFAULT_HP, DEFAULT_DEF, 150, 200);
    }

    public void update(float delta) {}

    public Ship getEnemy() {
        return enemy;
    }
    public Player getPlayer() {
        return player;
    }
}
