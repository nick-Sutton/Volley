package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import student.Student;

public class VolleyIO {

    public static ArrayList<Student> readStudentFromFile(String fileName) throws FileNotFoundException {
        ArrayList<Student> studentList;

        try (Scanner fileReader = new Scanner(new FileInputStream(fileName))) {
            studentList = new ArrayList<>();

            // Skip first line that contains column headers
            if (fileReader.hasNextLine()) {
                fileReader.nextLine();
            }

            while(fileReader.hasNextLine()) {
                Student student = parseStudent(fileReader.nextLine());
                studentList.add(student);
            }
        } catch(FileNotFoundException e) {
            throw new IllegalArgumentException(e.getMessage());
        }

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
        try (PrintStream fileWriter = new PrintStream(new File(fileName))) {
            for (int i = 0; i < studentList.size(); i++) {
                fileWriter.println(studentList.get(i).toString());
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }
}
