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
import java.util.Scanner;

public class CountIssueInFile {
    
    public static int getNumberOfClassInJavaFile(File file) throws IOException {
        int result = 0;
        // Open the file
        Scanner in = new Scanner(file);
        String strLine;

        //Read File Line By Line
        try {
            while ((strLine = in.nextLine()) != null) {
                if (strLine.contains("main") & strLine.contains("args")) {
                    result++;
                   
                }
            }
        } catch (Exception ex) {
        }
        return result;
    }

    
}
