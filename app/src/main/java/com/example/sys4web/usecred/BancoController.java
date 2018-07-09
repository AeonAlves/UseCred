package com.example.sys4web.usecred;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by SYS4WEB on 26/11/2017.
 */

public class BancoController {

    private static BancoController gw;
    private SQLiteDatabase db;

    private BancoController(Context ctx){
        CriaBanco cria = new CriaBanco(ctx);
        db = cria.getReadableDatabase();
    }

    public static BancoController getInstance(Context ctx){
        if(gw == null)
            gw = new BancoController(ctx);
        return gw;
    }

    public SQLiteDatabase getDatabase(){
        return this.db;
    }

}