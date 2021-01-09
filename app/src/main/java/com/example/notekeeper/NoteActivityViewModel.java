package com.example.notekeeper;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {

    //get the package name and make it a constant here
    public static final String ORIGINAL_NOTE_COURSE_ID = "com.example.notekeeper.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_TITLE = "com.example.notekeeper.ORIGINAL_NOTE_TITLE";
    public static final String ORIGINAL_NOTE_TEXT = "com.example.notekeeper.ORIGINAL_NOTE_TEXT";


    //call the package field
    public String mOriginalNoteCourseId;
    public String mOriginalNoteTitle;
    public String mOriginalNoteText;
    public boolean mIsNewlyCreated = true;


    //save the state here
    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        outState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        outState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }

    //restore the state
    public void restoreState(Bundle inState){
        inState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalNoteCourseId);
        inState.putString(ORIGINAL_NOTE_TITLE, mOriginalNoteTitle);
        inState.putString(ORIGINAL_NOTE_TEXT, mOriginalNoteText);
    }
}


