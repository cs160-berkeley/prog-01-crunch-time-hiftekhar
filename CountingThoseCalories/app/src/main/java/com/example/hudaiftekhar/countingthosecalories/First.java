package com.example.hudaiftekhar.countingthosecalories;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


/* This class enables the user to pick an activity that are counted through
    minutes (if you clicked minutes on home screen).

 */

public class First extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
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

        TextView newText = (TextView) findViewById(R.id.textView7);

        newText.setTypeface(Typeface.MONOSPACE, Typeface.BOLD_ITALIC);
        newText.setText("Which Exercise?");

    }

    public void goNextScreen2(View v) {

        Intent thirdScreen = new Intent(First.this, ThirdActivity.class);


        RadioGroup radioGroupOne = (RadioGroup) findViewById(R.id.radioGroup2);
        int whichButton = radioGroupOne.getCheckedRadioButtonId();

        RadioButton radioButtonOne = (RadioButton) findViewById(whichButton);
        String text = radioButtonOne.getText().toString();


        Bundle bundle = getIntent().getExtras();
        String val = bundle.getString("numReps"); //but it's really minutes

        thirdScreen.putExtra("numReps", val); //store the number of minutes
        thirdScreen.putExtra("text", text); //store the exercise

        startActivity(thirdScreen);

    }


}



