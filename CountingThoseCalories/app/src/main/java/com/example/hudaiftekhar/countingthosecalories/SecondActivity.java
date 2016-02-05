package com.example.hudaiftekhar.countingthosecalories;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;
import android.widget.EditText;
import android.graphics.Typeface;
import android.content.Intent;
import android.widget.RadioGroup;
import android.widget.RadioButton;


/* This class enables the user to pick an activity that are counted through
    repetitions (if you clicked repetitions on home screen).

 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        TextView newText = (TextView) findViewById(R.id.textView2);

        newText.setTypeface(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);
        newText.setText("Which Exercise?");




    }

    /* when you click a button, you go to the next screen (ThirdActivity) */


    public void goNextScreen(View v) {

        Intent thirdScreen = new Intent(SecondActivity.this, ThirdActivity.class);


        RadioGroup radioGroupOne = (RadioGroup) findViewById(R.id.radioGroup4);
        int whichButton = radioGroupOne.getCheckedRadioButtonId();

        RadioButton radioButtonOne = (RadioButton) findViewById(whichButton);
        String text = radioButtonOne.getText().toString();


        Bundle bundle = getIntent().getExtras();
        String val = bundle.getString("numReps"); // this is the numReps
        String whichButton2 = bundle.getString("whichButton");

        thirdScreen.putExtra("numReps", val); // storing the number of repetitions
        thirdScreen.putExtra("text", text); //storing the exercise you have chosen

        startActivity(thirdScreen);

    }





}
