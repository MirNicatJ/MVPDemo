package com.jabbarli.mirnicat.mvpdemo.POJO;

import com.google.gson.annotations.SerializedName;

public class Post {

    @SerializedName("id")
    private String mId;

    @SerializedName("userId")
    private String mUserId;

    @SerializedName("title")
    private String mTitle;
    
    @SerializedName("body")
    private String mBody;

    public String getmId() {
        return mId;
    }

    public String getmUserId() {
        return mUserId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmBody() {
        return mBody;
    }
}
