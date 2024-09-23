package builder;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import io.VolleyIO;
import student.Student;
import team.Team;

public class TeamBuilder {
    private ArrayList<Student> studentList;
    private ArrayList<Team> teamList;

    public TeamBuilder(String fileName) {
        teamList = new ArrayList<Team>();

        try {
            studentList = VolleyIO.readStudentFromFile(fileName);
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Cannot Find File");
        }
    }

    public void generateTeamList() {
        int teamCounter = 0;

        for (int i = 0; i < studentList.size(); i++) {
            // Compare each time and find number of unique ones
            teamCounter++;
        }

        for (int j = 0; j < teamCounter; j++) {
            Team team = new Team(j, 0, 0);
            teamList.add(team);
        }
    }

    public void removeTeam(int teamNumber) {
        for (int i = 0; i < teamList.size(); i++) {
            if (teamList.get(i).getTeamNumber() == teamNumber) {
                teamList.remove(i);
                break; // Prevents ConcurrentModificationException after removal
            }
        }
    }

    public void assignStudentsToTeams() {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getStartTime() == teamList.get(i).getStartTime() &&
                studentList.get(i).getEndTime() == teamList.get(i).getEndTime()) {
                teamList.get(i).addStudentToTeam(studentList.get(i));
            }
        }
    }

    public void removeStudentFromTeam(String studentName, int teamNumber) {

    }

    public void exportTeams(String filename) {
        try {
            VolleyIO.writeStudentToFile(filename, studentList);
        } catch (IOException e) {
            throw new IllegalArgumentException("File Cannot be Saved");
        }
    }
}
