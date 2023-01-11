package com.factoriaf5.kata;

public class Character {
    int initHealth = 1000;
    int actualHealth = initHealth;
    int initDamage = 100;
    int actualDamage = 100;
    int initSanation = 100;
    int actualSanation = 100;
    int initLevel = 1;
    int actualLevel = initLevel;
    boolean alive = true;

    public Character() {
        this.initHealth = getInitHealth();
        this.actualHealth = getActualHealth();
        this.initDamage = getInitDamage();
        this.actualDamage = getActualDamage();
        this.initSanation = getInitSanation();
        this.actualSanation = getActualSanation();
        this.initLevel = getInitLevel();
        this.actualLevel = getActualLevel();
        this.alive = isAlive();
    }
    
    public int getInitHealth() {
        return initHealth;
    }

    public void setInitHealth(int initHealth) {
        this.initHealth = initHealth;
    }

    public int getActualHealth() {
        return actualHealth;
    }

    public void setActualHealth(int actualHealth) {
        this.actualHealth = actualHealth;
    }

    public int getInitDamage() {
        return initDamage;
    }

    public void setInitDamage(int initDamage) {
        this.initDamage = initDamage;
    }

    public int getActualDamage() {
        return actualDamage;
    }

    public void setActualDamage(int actualDamage) {
        this.actualDamage = actualDamage;
    }

    public int getInitSanation() {
        return initSanation;
    }

    public void setInitSanation(int initSanation) {
        this.initSanation = initSanation;
    }

    public int getActualSanation() {
        return actualSanation;
    }

    public void setActualSanation(int actualSanation) {
        this.actualSanation = actualSanation;
    }

    public int getInitLevel() {
        return initLevel;
    }

    public void setInitLevel(int initLevel) {
        this.initLevel = initLevel;
    }

    public int getActualLevel() {
        return actualLevel;
    }

    public void setActualLevel(int actualLevel) {
        this.actualLevel = actualLevel;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setDamage(Character character) {
        character.actualHealth -= this.initDamage;
        setActualHealth(character.actualHealth);
        if(character.getActualHealth() <= 0){
            character.setAlive(false);
        }
    }

    public void setSanation(Character character) {
        if(!character.isAlive()){          
            return;
        }
        character.actualHealth += this.actualSanation;
        if(character.actualHealth > 1000){
            character.actualHealth = 1000;
        }
        setActualHealth(character.actualHealth);
    }
}