package main;

import io.VolleyIO;
/**
 * TODO
 * 1. We need to parse out the column headers and the first two columns for hashing. The time submitted might be useful for hashing.
 * 2. We still need to keep track of these elements for when we write to a csv file.
 * 3. The current Implementation does not account for the missing time inputs. Instead of "" there is nothing.
 * 4. Write a hashing function.
 * 5. Check if I need to refactor team and team builder responsibilities.
 */
public class Main {
    // Has Object oriented programming gone too far
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        VolleyIO.readStudentFromFile("volley/test_files/Test.csv");
    }
}

