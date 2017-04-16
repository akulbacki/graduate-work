package com.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.pa.Resources;

import java.util.Random;

public class Player extends GameObjects {
    Ship target;
    Sprite sprite;
    float targetHealth, residue;
    int crit, movePoint;
    private Random random;

    public Player(Sprite sprite, float bornDamage, float bornHealth, float bornDefence, float x, float y) {
        this.sprite = sprite;
        this.damage = bornDamage;
        this.health = bornHealth;
        this.defence = bornDefence;
        movePoint = 3;
        setPosition(x, y);
        random = new Random();
    }

    public void attack(Ship target){
        targetHealth = target.getHealth();
        crit = random.nextInt(4);
        residue = targetHealth - damage;
        target.setHealth(residue);
    }

    public void draw(Batch batch, float parentAlpha) {
        batch.draw(Resources.facArrow, getX() - sprite.getWidth()/2,
                getY() +  sprite.getHeight()/5, Resources.facArrow.getWidth(), Resources.facArrow.getHeight());
        batch.draw(sprite, getX() - sprite.getWidth()/2, getY() -  sprite.getHeight()/2, sprite.getWidth(), sprite.getHeight());
    }

    public void setMovePoint(int setMP){
        this.movePoint = setMP;
    }

    public int getMovePoint(){ return movePoint; }
}
