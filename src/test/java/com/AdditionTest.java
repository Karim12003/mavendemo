package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;



public class AdditionTest {

    @Test
    public void testIfAdditionWorks() {
        Addition addition = new Addition();
        assertEquals(2, addition.add(1,1));
    }


    @Test
    public void testIfAdditionNotWorksIfParametersAreWrong(){
        assertNotEquals(2 , new Addition().add(1,2));
    }

}