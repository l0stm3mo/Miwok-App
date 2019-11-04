package com.example.android.miwok;

import android.media.Image;

public class Word {

    //Default translation for the word/
    private String mDefaultTranslation;

    //MIwok translation for the Word/
    private String mMiwokTranslation;

    // Image Resource ID for the word/
    private int mImageResourceId = NO_IMAGE_PROVIEDED;

    private static final int NO_IMAGE_PROVIEDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //Get the default translation of the word,
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //Get the default translation of the word,
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //Image resource IDfor the words/
    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIEDED;
    }
}
