package com.factoriaf5.kata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CharacterTest {
    
    @Test
    public void character_have_1000_health_level_1_and_is_alive () {
        Character myCharacter = new Character();
        assertEquals(myCharacter.alive, true);
        assertEquals(myCharacter.initHealth, 1000);
        assertEquals(myCharacter.actualLevel, 1);
    }

    @Test
    public void character_have_a_damage () {
        Character myCharacter = new Character();
        Character otherCharacter = new Character();
        int initHealth = otherCharacter.getActualHealth();
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
        assertTrue(otherCharacter.getActualHealth() < initHealth);
    }
}