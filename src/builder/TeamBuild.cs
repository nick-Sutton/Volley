using System;
using System.Collections.Generic;
using System.IO;
using Volley.src.io;
using Volley.src.student;
using Volley.src.team;

namespace Volley.src.builder;

public class TeamBuilder
{
    public List<Student> studentList;
    public List<Team> teamList;
    public TeamBuilder(string fileName) {
        teamList = new List<Team>();

        try {
            studentList = VolleyIO.readStudentFromFile(fileName);
        } catch (FileNotFoundException) {
            throw new ArgumentException("Cannot Find File");
        }
    }

    public void generateTeamList() {
        int teamCounter = 0;

        for (int i = 0; i < studentList.Count; i++) {
            // Compare each time and find number of unique ones
            teamCounter++;
        }   

        for (int j = 0; j < teamCounter; j++) {
            Team team = new Team(j, 0 ,0);
            teamList.Add(team);
        }
    }

    public void removeTeam(int teamNumber) {
        for (int i = 0; i < teamList.Count; i++) {
            if (teamList[i].TeamNumber == teamNumber) {
                teamList.RemoveAt(i);
            }
        }
    }

    public void assignStudentsToTeams() {
        for (int i = 0; i < studentList.Count; i++) {
            if (studentList[i].StartTime == teamList[i].StartTime && studentList[i].EndTime == teamList[i].EndTime) {
                teamList[i].addStudentToTeam(studentList[i]); 
            }
        }
        
    }

    public void removeStudentFromTeam(string studentName, int teamNumber) {
        
    }

    public void exportTeams(String filename) {
        try {
            VolleyIO.writeStudentToFile(filename, studentList);
        } catch (IOException) {
            throw new ArgumentException("File Cannot be Saved");
        }
    }
}