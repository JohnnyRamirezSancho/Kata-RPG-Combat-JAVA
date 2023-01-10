package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void character_have_1000_health_level_1_andis_alive () {
        Character myCharacter = new Character();
        assertEquals(myCharacter.alive, true);
        assertEquals(myCharacter.health, 1000);
        assertEquals(myCharacter.level, 1);
    }

    @Test
    public void character_hava_damage () {
        Character myCharacter = new Character();
        Character otherCharacter = new Character();
        int initHealth = otherCharacter.getHealth();
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        myCharacter.setDamage(otherCharacter);
        assertFalse(otherCharacter.isAlive());
        assertTrue(otherCharacter.getHealth() < initHealth);
    }
}