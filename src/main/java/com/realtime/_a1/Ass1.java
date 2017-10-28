/**
 * Course : STIW3054
 * Group  : A
 * Task   : Assignment 1
 * Name   : Lee Jia Wei
 * Matric : 240008
 */
package com.realtime._a1;

import static com.realtime._a1.CountOfJavaFiles.getCountOfJavaFiles;
import java.io.IOException;
import java.util.ArrayList;

public class Ass1 {

    public static ArrayList<String> fileName = new ArrayList();
    public static String Directory;

    public static void main(String[] args) throws IOException {
        Ass1 ass = new Ass1();
        ass.getFilePath();
        System.out.println("Number of Java Files = " + getCountOfJavaFiles(Directory));
        System.out.println("Number of Issues = " + CountOfClassInDirectory.getCountOfClassInDirectory(Directory));
    }

    public String getFilePath() {
       
        Directory = System.getProperty("user.dir")+ "\\" + "javafile";
        System.out.println(Directory);
        
        return Directory;
    }
}
