namespace Volley.src.student;

public class Student
{
   public string Name { get; set; }
   public string Email { get; set; }
   public string MeetingDays { get; set; }
   public int StartTime { get; set; }
   public int EndTime { get; set; }
   public int TeamNumber { get; set; }

    public Student(string name, string email, string meetingDays, int startTime, int endTime) {
        Name = name;
        Email = email;
        MeetingDays = meetingDays;
        StartTime = startTime;
        EndTime = endTime;
        TeamNumber = 0;
    }

    
}
