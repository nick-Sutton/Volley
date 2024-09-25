package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import student.Student;

public class VolleyIO {

    public ArrayList<Student> readStudentFromFile(String fileName) throws FileNotFoundException {
        Scanner fileReader = new Scanner(new FileInputStream(fileName)); 

        ArrayList<Student> studentList = new ArrayList<Student>();

        while(fileReader.hasNextLine()) {
            Student student = parseStudent(fileReader.nextLine());
            studentList.add(student);
        }
        fileReader.close();

        System.out.println(studentList.toString());
        return studentList;
    }

    private static Student parseStudent(String line) {
        Scanner lineReader = new Scanner(line);
        lineReader.useDelimiter(",");

        try {
    		
        	String name = lineReader.next();
        	String email = lineReader.next();
        	String mondayTimes = lineReader.next();
            String tuesdayTimes = lineReader.next();
            String wednesdayTimes = lineReader.next();
            String thursdayTimes = lineReader.next();
            String fridayTimes = lineReader.next();
    		
            return new Student(name, email, mondayTimes, tuesdayTimes, wednesdayTimes, thursdayTimes, fridayTimes);
    	} catch (Exception e) {
    		throw e;
    	} finally {
    		lineReader.close();
    	}

    }

    public static void writeStudentToFile(String fileName, ArrayList<Student> studentList) throws FileNotFoundException {
    	PrintStream fileWriter = new PrintStream(new File(fileName));

    	for (int i = 0; i < studentList.size(); i++) {
    	    fileWriter.println(studentList.get(i).toString());
    	}

    	fileWriter.close();
    }
}
