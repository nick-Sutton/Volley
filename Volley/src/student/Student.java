package student;

public final class Student {
    private String name;
    private String email;
    private String mondayTimes;
    private String tuesdayTimes;
    private String wednesdayTimes;
    private String thursdayTimes;
    private String fridayTimes;
    private int teamNumber;

    public Student(String name, String email, String mondayTimes, String tuesdayTimes, String wednesdayTimes, String thursdayTimes, String fridayTimes) {
        setName(name);
        setEmail(email);
        setMondayTimes(mondayTimes);
        setTuesdayTimes(tuesdayTimes);
        setWednesdayTimes(wednesdayTimes);
        setThursdayTimes(thursdayTimes);
        setFridayTimes(fridayTimes);
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
            throw new IllegalArgumentException("Invalid Student Email.");
        }

        this.email = email;
    }

    public String getMondayTimes() {
        return mondayTimes;
    }

    public final void setMondayTimes(String mondayTimes) {
        if (mondayTimes == null) {
            throw new IllegalArgumentException("Monday times cannot be null.");
        }
        this.mondayTimes = mondayTimes;
    }

    public String getTuesdayTimes() {
        return tuesdayTimes;
    }

    public final void setTuesdayTimes(String tuesdayTimes) {
        if (tuesdayTimes == null) {
            throw new IllegalArgumentException("Tuesday times cannot be null.");
        }
        this.tuesdayTimes = tuesdayTimes;
    }

    public String getWednesdayTimes() {
        return wednesdayTimes;
    }

    public final void setWednesdayTimes(String wednesdayTimes) {
        if (wednesdayTimes == null) {
            throw new IllegalArgumentException("Wednesday times cannot be null.");
        }
        this.wednesdayTimes = wednesdayTimes;
    }

    public String getThursdayTimes() {
        return thursdayTimes;
    }

    public final void setThursdayTimes(String thursdayTimes) {
        if (thursdayTimes == null) {
            throw new IllegalArgumentException("Thursday times cannot be null.");
        }
        this.thursdayTimes = thursdayTimes;
    }

    public String getFridayTimes() {
        return fridayTimes;
    }

    public final void setFridayTimes(String fridayTimes) {
        if (fridayTimes == null) {
            throw new IllegalArgumentException("Friday times cannot be null.");
        }
        this.fridayTimes = fridayTimes;
    }

    // Getter and Setter for TeamNumber
    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public void appendDayToTimes() {
        this.mondayTimes = "m:" + getMondayTimes();
        this.tuesdayTimes = "t:" + getTuesdayTimes();
        this.wednesdayTimes = "w:" + getWednesdayTimes();
        this.thursdayTimes = "u:" + getThursdayTimes();
        this.fridayTimes = "f:" + getFridayTimes();
        
    }

    @Override
    public String toString() {
        return name + "," + email + "," + mondayTimes + "," + 
               tuesdayTimes + "," + wednesdayTimes + "," + 
               thursdayTimes + "," + fridayTimes;
    }
}
