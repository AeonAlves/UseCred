package com.example.sys4web.usecred;

/**
 * Created by SYS4WEB on 24/11/2017.
 */

public class BancoCat {
    private int catid;
    private String catdesc;

    public BancoCat(int catid, String catdesc) {
        this.catid = catid;
        this.catdesc = catdesc;
    }

    public int getCatid() {
        return catid;
    }

    public String getCatdesc() {
        return catdesc;
    }
}
