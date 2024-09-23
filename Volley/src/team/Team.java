package team;

import java.util.ArrayList;
import java.util.List;

import student.Student;

public class Team {
    private List<Student> teamList;
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

    public void setTeamList(List<Student> teamList) {
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

    // Getter and Setter for TeamNumber
    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public void addStudentToTeam(Student student) {
        teamList.add(student);
    }
}
