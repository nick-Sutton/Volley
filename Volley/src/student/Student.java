package student;

import java.util.ArrayList;

public final class Student {
    private String name;
    private String email;
    private ArrayList<Integer> mondayTimes;
    private ArrayList<Integer> tuesdayTimes;
    private ArrayList<Integer> wednesdayTimes;
    private ArrayList<Integer> thursdayTimes;
    private ArrayList<Integer> fridayTimes;
    private int teamNumber;

    public Student(String name, String email, ArrayList<Integer> mondayTimes, ArrayList<Integer> tuesdayTimes, ArrayList<Integer> wednesdayTimes, ArrayList<Integer> thursdayTimes, ArrayList<Integer> fridayTimes) {
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

        int atSymbolIndex = email.indexOf('@');
		int lastPeriodIndex = email.lastIndexOf('.');

		if (atSymbolIndex == -1 || lastPeriodIndex == -1 || lastPeriodIndex < atSymbolIndex) {
			throw new IllegalArgumentException("Invalid Student Email.");
		}

        this.email = email;
    }

    public ArrayList<Integer> getMondayTimes() {
        return mondayTimes;
    }

    public void setMondayTimes(ArrayList<Integer> mondayTimes) {
        this.mondayTimes = mondayTimes;
    }

    public ArrayList<Integer> getTuesdayTimes() {
        return tuesdayTimes;
    }

    public void setTuesdayTimes(ArrayList<Integer> tuesdayTimes) {
        this.tuesdayTimes = tuesdayTimes;
    }

    public ArrayList<Integer> getWednesdayTimes() {
        return wednesdayTimes;
    }

    public void setWednesdayTimes(ArrayList<Integer> wednesdayTimes) {
        this.wednesdayTimes = wednesdayTimes;
    }

    public ArrayList<Integer> getThursdayTimes() {
        return thursdayTimes;
    }

    public void setThursdayTimes(ArrayList<Integer> thursdayTimes) {
        this.thursdayTimes = thursdayTimes;
    }

    public ArrayList<Integer> getFridayTimes() {
        return fridayTimes;
    }

    public void setFridayTimes(ArrayList<Integer> fridayTimes) {
        this.fridayTimes = fridayTimes;
    }

    // Getter and Setter for TeamNumber
    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    @Override
    public String toString() {
        return name + "," + email + "," + mondayTimes + "," + 
               tuesdayTimes + "," + wednesdayTimes + "," + 
               thursdayTimes + "," + fridayTimes;
    }
}
