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

public class CountOfJavaFilesTest {

    @Test
    public void testGetCountOfJavaFiles() {
        System.out.println("getCountOfJavaFiles");
        Ass1 instance = new Ass1();
        String Directory = instance.getFilePath();
        int expResult = 4;
        int result = CountOfJavaFiles.getCountOfJavaFiles(Directory);
        assertEquals(expResult, result);

    }

}
