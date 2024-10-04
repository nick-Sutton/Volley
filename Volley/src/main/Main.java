package main;

import io.VolleyIO;
/**
 * TODO
 * 1. We need to parse out the column headers and the first two columns for hashing. The time submitted might be useful for hashing.
 *  -Maybe use clustering algorithm or graph instead of hash
 * 2. We still need to keep track of these elements for when we write to a csv file.
 * 4. Write a hashing function.
 * 5. Check if I need to refactor team and team builder responsibilities.
 * 6. Process times first to cull unpopular times. 
 * 7. The min number of people needed for a volleyball team is 6(Maybe 12)
 * 
 * 
 * iterate over all times. Cull times that are unpopular. Make groups based on common time and max/min team members. For users with 
 * mutltiple times, some will get culled. We select a time for them that works best for effiecent group making.
 * Make people with similar close in the graph while people with very different times are far away(Union Find Algorithm)
 * 
 * https://www.geeksforgeeks.org/union-by-rank-and-path-compression-in-union-find-algorithm/#
 */
public class Main {
    // Has Object oriented programming gone too far
    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        VolleyIO.readStudentFromFile("volley/test_files/Test.csv");
    }
}

