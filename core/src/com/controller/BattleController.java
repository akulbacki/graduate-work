package com.controller;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.entities.BattleSides;
import java.util.Random;

public class BattleController  {
    BattleSides entities;
    boolean playerTurn;
    Random random;

    public BattleController(BattleSides sides){
        this.entities = sides;
        random = new Random();
        playerTurn = random.nextBoolean();
    }

    public void turnListener(){
        if (Gdx.input.isKeyPressed(Input.Keys.ENTER)) {
            if(playerTurn){
                entities.player.attack(entities.enemy);
                playerTurn = false;
            }
        } else if(!playerTurn){
            entities.enemy.MakeTurn(entities.player);
            playerTurn = true;
        }
    }
}

