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

    public void setInitHealth(int health) {
        this.initHealth = health;
    }

    public int getInitDamage() {
        return initDamage;
    }

    public void setInitDamage(int damage) {
        this.initDamage = damage;
    }

    public int getLevel() {
        return initLevel;
    }

    public void setLevel(int level) {
        this.initLevel = level;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    public void setDamage(Character character) {
        character.actualHealth -= this.initDamage;
        setHealth(character.actualHealth);
        if(character.getHealth() <= 0){
            character.setAlive(false);
        }
    }

    public void setSanation(Character character) {
        if(!character.isAlive()){          
            return;
        }
        character.health += this.sanation;
        if(character.health > 1000){
            character.health = 1000;

        }
        setHealth(character.health);
        if(character.getHealth() <= 0){
            character.setAlive(false);
        }
    }
    
}
