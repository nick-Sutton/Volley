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
            // Submission date and time used for hashing function
    		String submitionDate = lineReader.next();
            String submitionTime = lineReader.next();

            String name = lineReader.next();
            String email = lineReader.next();

            String mondayString = lineReader.hasNext() ? lineReader.next() : "";
            String tuesdayString = lineReader.hasNext() ? lineReader.next() : "";
            String wednesdayString = lineReader.hasNext() ? lineReader.next() : "";
            String thursdayString = lineReader.hasNext() ? lineReader.next() : "";
            String fridayString = lineReader.hasNext() ? lineReader.next() : "";

            ArrayList<Integer> mondayTimes = parseTime(mondayString);
            ArrayList<Integer> tuesdayTimes = parseTime(tuesdayString);
            ArrayList<Integer> wednesdayTimes = parseTime(wednesdayString);
            ArrayList<Integer> thursdayTimes = parseTime(thursdayString);
            ArrayList<Integer> fridayTimes = parseTime(fridayString);

    		
            return new Student(name, email, mondayTimes, tuesdayTimes, wednesdayTimes, thursdayTimes, fridayTimes);
    	 } catch (Exception e) {
    		throw e;
    	} finally {
    		lineReader.close();
    	}

    }
    
    private static ArrayList<Integer> parseTime(String timeString) {
        String[] times = timeString.split(";");
        ArrayList<Integer> dayTimes = new ArrayList<>();

        for (String time : times) {
            String[] timeStringArray = time.split("-");
            String startTime = timeStringArray[0];
            String endTime = timeStringArray[1];
    
            int start24 = convertTo24Hour(startTime);
            int end24 = convertTo24Hour(endTime);
    
            int formattedTime = start24 * 10000 + end24; 
            dayTimes.add(formattedTime); 
        }

        return dayTimes;
    }

    private static int convertTo24Hour(String time) {
        // Check if the time contains "AM" or "PM"
        boolean isPM = time.endsWith("PM");
        boolean isAM = time.endsWith("AM");

        // Remove "AM" or "PM" from the time string
        time = time.replace("AM", "").replace("PM", "").trim();

        // Split into hours and minutes
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        // Convert to 24-hour time
        if (isPM && hour != 12) {
            hour += 12;
        } else if (isAM && hour == 12) {
            hour = 0;
        }

        return hour * 100 + minute;
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
