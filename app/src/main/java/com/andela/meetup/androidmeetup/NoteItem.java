package com.andela.meetup.androidmeetup;

public class NoteItem {

    private String mName;

    public NoteItem(String name) {
        this.mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}
