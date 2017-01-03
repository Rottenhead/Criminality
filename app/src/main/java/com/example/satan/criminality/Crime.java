package com.example.satan.criminality;

import java.util.Date;
import java.util.UUID;

class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    Crime() {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    void setTitle(String title) {
        mTitle = title;
    }

    Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    void setSolved(boolean solved) {
        mSolved = solved;
    }
}
