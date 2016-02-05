package com.example.hudaiftekhar.countingthosecalories;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class ExerciseCalc extends AppCompatActivity {

    /* This class is essentially the implementation of an extra credit point:
       enter the number of calories you want to exercise off, and you can see
       how much of each exercise you need to do.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_calc);
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

        Bundle bundle = getIntent().getExtras();
        String val = bundle.getString("numReps1"); // obtain number of calories
        int numReps = Integer.valueOf(val);


        // just calculating the number of repetitions/minutes of exercises
        // in order to exercise off that number of calories.

        float numReps1A = (float) 0.0;
        numReps1A = (float) (numReps/3.5);
        String numReps1 = String.format("%.2f", numReps1A);

        float numReps2A = (float) 0.0;
        numReps2A = (float) (numReps/2);
        String numReps2 = String.format("%.2f", numReps2A);

        float numReps3A = (float) 0.0;
        numReps3A = (float) (numReps/2.25);
        String numReps3 = String.format("%.2f", numReps3A);

        float numReps4A = (float) 0.0;
        numReps4A = (float) (numReps/0.25);
        String numReps4 = String.format("%.2f", numReps4A);

        float numReps5A = (float) 0.0;
        numReps5A = (float) (numReps/0.25);
        String numReps5 = String.format("%.2f", numReps5A);

        float numReps6A = (float) 0.0;
        numReps6A = (float) (numReps/0.1);
        String numReps6 = String.format("%.2f", numReps6A);

        float numReps7A = (float) 0.0;
        numReps7A = (float) (numReps);
        String numReps7 = String.format("%.2f", numReps7A);

        float numReps8A = (float) 0.0;
        numReps8A = (float) (numReps/0.12);
        String numReps8 = String.format("%.2f", numReps8A);

        float numReps9A = (float) 0.0;
        numReps9A = (float) (numReps/0.2);
        String numReps9 = String.format("%.2f", numReps9A);

        float numReps10A = (float) 0.0;
        numReps10A = (float) (numReps/0.12);
        String numReps10 = String.format("%.2f", numReps10A);

        float numReps11A = (float) 0.0;
        numReps11A = (float) (numReps/0.13);
        String numReps11 = String.format("%.2f", numReps11A);

        float numReps12A = (float) 0.0;
        numReps12A = (float) (numReps/0.15);
        String numReps12 = String.format("%.2f", numReps12A);

        TextView textOne =  (TextView) findViewById(R.id.textView20);
        textOne.setText("To burn " + numReps + " calories, you need to do " + numReps1 + " repetitions of pushups, " + numReps2 + " repetitions of situps, " + numReps3 + " repetitions of squats, " + numReps4  + " minutes of leg-lifts, "+ numReps5 + " minutes of planking, "+ numReps6 + " minutes of jumping jacks, "+ numReps7 + " repetitions of pull ups, " + numReps8 + " minutes of cycling, " + numReps9 + " minutes of walking, " + numReps10 + " minutes of jogging, " + numReps11 + " minutes of swimming, or " + numReps12 + " minutes of stair-climbing.");







    }

    // takes up back to home screen

    public void clickHomeScreen2(View v) {

        Intent thirdScreen2 = new Intent(ExerciseCalc.this, home.class);

        startActivity(thirdScreen2);
    }

}
