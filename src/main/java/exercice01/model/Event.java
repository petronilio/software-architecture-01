package exercice01.model;

import java.util.ArrayList;

public class Event{
    private int id;
    private String name;
    private ArrayList<Activities> listActivities;

     // GET AND SETTERS
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Activities> getListActivities() {
        return this.listActivities;
    }

    public void setListActivities(ArrayList<Activities> listActivities) {
        this.listActivities = listActivities;
    }

}
