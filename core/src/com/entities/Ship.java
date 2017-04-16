package com.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.pa.Resources;
import java.util.Random;

public class Ship extends GameObjects {
    Player target;
    Sprite sprite;
    float residue;
    int state;
    private Random random;

    Ship(Sprite bornSprite, float bornDamage, float bornHealth, float bornDefence, float x, float y){
        this.sprite = bornSprite;
        this.damage = bornDamage;
        this.health = bornHealth;
        this.defence = bornDefence;
        state = 0;
        setPosition(x,y);
        saveParam(bornDamage, bornDefence);
        random = new Random();
    }

    public void draw(Batch batch, float parentAlpha) {
        batch.draw(Resources.facGideon, getX() - sprite.getWidth()/2,
                getY() +  sprite.getHeight()/5, Resources.facGideon.getWidth(), Resources.facGideon.getHeight());
        batch.draw(sprite, getX() - sprite.getWidth()/2, getY() -  sprite.getHeight()/2, sprite.getWidth(), sprite.getHeight());
    }

    public void act(float delta) { super.act(delta); }

    public void MakeTurn(Player target){
        if(health < 20.0 || (target.getDamage() <= damage && target.getDefence() >= defence)) {
            state = 1;
        } else if(target.getDamage() > damage){
            state = 3;
        } else {
            state = 2;
        }
        switch(state) {
            default:
            case 1: //Aggressive
                attack(target);
                break;
            case 2: //Careful
                attack(target);
                break;
            case 3: //Defense
                attack(target);
                break;
        }
        Gdx.app.log("AI status: " + state, "Player " + target.getHealth() + " vs " + getHealth());
        restoreParam();
    }

    public void attack(Player target){
        float targetHealth = target.getHealth();
        lucky = random.nextInt(4)+1;
        residue = targetHealth  - damage;
        target.setHealth(residue);
    }

}
