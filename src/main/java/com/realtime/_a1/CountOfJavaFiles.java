/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 1
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a1;

import java.io.File;

public class CountOfJavaFiles {
    
    public static int getCountOfJavaFiles(String s) {
        int result = 0;
        File[] files = new File(s).listFiles();
        for (int i = 0; i < files.length; i++) {
            String fileName = files[i].getName();
            String suffix = "";
            try {
                suffix = fileName.substring(fileName.length() - 4);
            } catch (Exception ex) {
            }
            if (suffix.equals("java")) {
                result++;
            }
        }
        return result;
    }

}
