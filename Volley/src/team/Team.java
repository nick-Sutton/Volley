package team;

import java.util.ArrayList;
import java.util.List;

import student.Student;

public class Team {
    private ArrayList<Student> teamList;
    private int startTime;
    private int endTime;
    private int teamNumber;

    public Team(int teamNumber, int startTime, int endTime) {
        setTeamNumber(teamNumber);
        setStartTime(startTime);
        setEndTime(endTime);
        this.teamList = new ArrayList<>();
    }

    // Getter and Setter for TeamList
    public List<Student> getTeamList() {
        return teamList;
    }

    public void setTeamList(ArrayList<Student> teamList) {
        this.teamList = teamList;
    }

    // Getter and Setter for StartTime
    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    // Getter and Setter for EndTime
    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public int getTeamNumber() {
        return this.teamNumber;
    }

    public void setTeamNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Team Number out of Range.");
        }
    }

    public void addStudentToTeam(Student student) {
        teamList.add(student);
    }
}
