package com.juborajsarker.voicerecorder.listeners;

/**
 * Created by jubor on 12/9/2017.
 */

public interface OnDatabaseChangedListener{
    void onNewDatabaseEntryAdded();
    void onDatabaseEntryRenamed();
}