/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 1
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountOfClassInDirectoryTest {
    
    @Test
    public void testGetCountOfClassInDirectory() throws Exception {
        System.out.println("getCountOfClassInDirectory");
        Ass1 instance = new Ass1();
        String Directory = instance.getFilePath();
        int expResult = 3;
        int result = CountOfClassInDirectory.getCountOfClassInDirectory(Directory);
        assertEquals(expResult, result);
        
    }
    
}
