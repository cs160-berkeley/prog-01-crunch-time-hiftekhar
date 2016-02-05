package com.example.hudaiftekhar.countingthosecalories;

import android.app.Application;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Globals extends Application {

    private String numRP= "1";

    public String getnumRP(){
        return this.numRP;
    }

    public void setnumRP(String d){
        this.numRP=d;
    }


}
