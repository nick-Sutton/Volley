package student;

public class Student {
    private String name;
    private String email;
    private String meetingDays;
    private int startTime;
    private int endTime;
    private int teamNumber;

    public Student(String name, String email, String meetingDays, int startTime, int endTime) {
        setName(name);
        setEmail(email);
        setMeetingDays(meetingDays);
        setStartTime(startTime);
        setEndTime(endTime);
        setTeamNumber(0);
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.length() == 0) {
            throw new IllegalArgumentException("Invalid Student Name.");
        }

        this.name = name;
    }

    // Getter and Setter for Email
    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        if (email == null || email.length() == 0) {
            throw new IllegalArgumentException("Invalid Student Name.");
        }

        this.email = email;
    }

    // Getter and Setter for MeetingDays
    public String getMeetingDays() {
        return meetingDays;
    }

    public void setMeetingDays(String meetingDays) {
        if (meetingDays == null || meetingDays.length() == 0) {
            throw new IllegalArgumentException("Invalid Student Name.");
        }

        this.meetingDays = meetingDays;
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
}
