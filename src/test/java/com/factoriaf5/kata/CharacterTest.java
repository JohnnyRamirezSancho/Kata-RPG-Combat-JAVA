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
        myCharacter.setActualDamage(2000);
        myCharacter.setDamage(otherCharacter);
        assertFalse(otherCharacter.isAlive());
        assertTrue(otherCharacter.getActualHealth() < initHealth);
    }

    @Test
    public void character_alive_have_sanation () {
        Character myCharacter = new Character();
        Character otherCharacter = new Character();
        myCharacter.setDamage(otherCharacter);
        myCharacter.setSanation(otherCharacter);
        assertTrue(otherCharacter.isAlive());
        assertEquals(myCharacter.getActualHealth(), 950);
   }

    @Test
    public void character_alive_not_have_more_of_1000_health () {
        Character myCharacter = new Character();
        Character otherCharacter = new Character();
        myCharacter.setSanation(otherCharacter);
        assertTrue(otherCharacter.isAlive());
        assertEquals(myCharacter.getActualHealth(), 1000);
   }

   @Test
   public void character_not_alive_not_have_sanation () {
       Character myCharacter = new Character();
       Character otherCharacter = new Character();
       myCharacter.setActualDamage(2000);
       myCharacter.setDamage(otherCharacter);
       myCharacter.setSanation(otherCharacter);
       assertFalse(otherCharacter.isAlive());
       assertEquals(myCharacter.getActualHealth(), 0);
  }

  @Test
  public void character_not_damage_himself () {
      Character myCharacter = new Character();
      myCharacter.setActualDamage(2000);
      myCharacter.setDamage(myCharacter);
      assertTrue(myCharacter.isAlive());
      assertEquals(myCharacter.getActualHealth(), myCharacter.getInitHealth());
  }

}