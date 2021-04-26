package fr.unilim.iut.SpaceInvaders;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import fr.unilim.iut.SpaceInvenders.SpaceInvaders;

public class SpaceInvendersTest {
	   @Test
	   public void test_AuDebut_JeuSpaceInvaderEstVide() {
		    SpaceInvaders spaceinvaders = new SpaceInvaders(15, 10);
		    assertEquals("" + 
		    "...............\n" + 
		    "...............\n" +
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" + 
		    "...............\n" , spaceinvaders.toString());
	        }


}
