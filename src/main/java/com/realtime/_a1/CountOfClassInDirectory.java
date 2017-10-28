/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 1
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a1;

import java.io.File;
import java.io.IOException;

public class CountOfClassInDirectory {
    
    public static int getCountOfClassInDirectory(String Directory) throws IOException {
        int result = 0;
        File[] files = new File(Directory).listFiles();
        try {
            for (int i = 0; i < files.length; i++) {
                String fileName = files[i].getName();
                String suffix = "";

                suffix = fileName.substring(fileName.length() - 4);

                if (suffix.equals("java")) {
                    result = result + CountIssueInFile.getNumberOfClassInJavaFile(files[i]);
                }
            }
        } catch (Exception ex) {
        }
        return result;
    }
    
}
