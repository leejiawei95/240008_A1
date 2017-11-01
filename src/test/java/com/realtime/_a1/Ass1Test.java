/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 1
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a1;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

public class Ass1Test {
   
    @Test
    public void testGetFilePath() {
        System.out.println("getFilePath");
        Ass1 instance = new Ass1();
        String result = instance.getFilePath();
        String expResult = System.getProperty("user.dir")+ File.separator + "javafile";
        assertEquals(expResult, result);
    }
    
}
