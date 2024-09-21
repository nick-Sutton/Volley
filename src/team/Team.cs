using System.Collections.Generic;
using Volley.src.student;

namespace Volley.src.team;

public class Team
{
    public List<Student> TeamList { get; set; }
    public int StartTime { get; set; }
    public int EndTime { get; set; }
    public int TeamNumber { get; set; }

    public Team(int teamNumber, int startTime, int endTime) {
        TeamNumber = teamNumber;
        StartTime = startTime;
        EndTime = endTime;
        TeamList = new List<Student>();
    }

    public void addStudentToTeam(Student student) {
        TeamList.Add(student);
    }


}
