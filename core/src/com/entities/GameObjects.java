package com.entities;


import com.badlogic.gdx.scenes.scene2d.Actor;

public class GameObjects extends Actor {
    int bornType;
    float health, damage, defence, lucky, savedDmg, savedDef;
    String name;

    GameObjects(){}

    public void act(float delta) {
        super.act(delta);
    }

    public void setHealth(float setHealth){
        this.health = setHealth;
    }

    public float getHealth(){ return health; }

    public void setDamage(float setDamage){
        this.damage = setDamage;
    }

    public float getDamage(){ return damage; }

    public void setDefence(float setDefence){
        this.defence = setDefence;
    }

    public float getDefence(){ return defence; }

    public void saveParam(float bornDmg, float bornDef){
        savedDmg= bornDmg;
        savedDef = bornDef;
    }

    public void restoreParam(){
        damage = savedDmg;
        defence = savedDef;
    }

    public void repair(){
        this.health = health + 10;
    }

}
