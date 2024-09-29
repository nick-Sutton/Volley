package main;

import io.VolleyIO;
/**
 * TODO
 * 1. We need to parse out the column headers and the first two columns for hashing. The time submitted might be useful for hashing.
 * 2. We still need to keep track of these elements for when we write to a csv file.
 * 4. Write a hashing function.
 * 5. Check if I need to refactor team and team builder responsibilities.
 * 6. Process times first to cull unpopular times
 * 7. The min number of people needed for a volleyball team is 6(Maybe 12)
 */
public class Main {
    // Has Object oriented programming gone too far
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        VolleyIO.readStudentFromFile("volley/test_files/Test.csv");
    }
}

