package org.launchcode.techjobs.oo;

import javax.print.DocFlavor;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;

    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    public String toString() {
            return
                    System.lineSeparator()+
                    "ID: " + id + System.lineSeparator()+
                    "Name: " + (name != null && !name.equals("") ? name : "Data not available") + System.lineSeparator()+
                    "Employer: " + (employer.getValue() != null && !employer.getValue().equals("") ? employer.getValue() : "Data not available") + System.lineSeparator()+
                    "Location: " + (location.getValue() != null && !location.getValue().equals("") ? location.getValue() : "Data not available") + System.lineSeparator()+
                    "Position Type: " + (positionType.getValue() != null && !positionType.getValue().equals("") ? positionType.getValue() : "Data not available") + System.lineSeparator()+
                    "Core Competency: " + (coreCompetency.getValue() != null && !coreCompetency.getValue().equals("") ? coreCompetency.getValue() : "Data not available")+ System.lineSeparator();
    }




//        return "\nID: " + id +
//                "\nName: " + (name != null? name : "Data Not Available")+
//                "\nEmployer: " + (employer.getValue() != null || employer.getValue().equals("")?  "Data Not Available" : employer.getValue())+
//                "\nLocation: " +  (location.getValue() != null || location.getValue().equals(""))?  "Data Not Available" : location.getValue()+
//                "\nPosition Type: " + (positionType.getValue() != null ||positionType.getValue().equals("")) ? "Data Not Available" : positionType.getValue() +
//                "\nCore Competency: " + (coreCompetency.getValue() != null || coreCompetency.getValue().equals(""))? "Data Not Available" : coreCompetency.getValue();



    public static void resetNextId() {
        nextId = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return true;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;

    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}



