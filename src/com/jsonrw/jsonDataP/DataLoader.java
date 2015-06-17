package com.jsonrw.jsonDataP;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;


public class DataLoader {

    @Expose
    private String Dan;
    @Expose
    private List<Event> Events = new ArrayList<Event>();

    /**
     *
     * @return
     * The Dan
     */
    public String getDan() {
        return Dan;
    }

    /**
     *
     * @param Dan
     * The Dan
     */
    public void setDan(String Dan) {
        this.Dan = Dan;
    }

    /**
     *
     * @return
     * The Events
     */
    public List<Event> getEvents() {
        return Events;
    }

    /**
     *
     * @param Events
     * The Events
     */
    public void setEvents(List<Event> Events) {
        this.Events = Events;
    }

}