package com.example.hudaiftekhar.countingthosecalories;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

/*
    This is essentially where we calculate equivalent exercises and number of calories exercised of
    based on # of repetitions or minutes.

 */

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
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

        TextView miyaOne = (TextView) findViewById(R.id.textView3);
        TextView miyaTwo = (TextView) findViewById(R.id.textView4);
        TextView miyaFive = (TextView) findViewById(R.id.textView7);


        Bundle bundle = getIntent().getExtras();
        String val = bundle.getString("numReps");
        int numReps = Integer.valueOf(val);
        String whichExercise = bundle.getString("text");

            float numCaloriesA = (float) 0.0;
            double numCalories3A = (float) 0.0;
            double numCalories4A = (float) 0.0;
            double numCalories5A = (float) 0.0;
            float numCalories6A = (float) 0.0;
            float numCalories7A = (float) 0.0;
            float numCalories8A = (float) 0.0;
            float numCalories9A = (float) 0.0;
            float numCalories10A = (float) 0.0;
            float numCalories11A = (float) 0.0;
            float numCalories12A = (float) 0.0;
            float numCalories13A = (float) 0.0;

            String numCalories = "";
            String numCalories3 = "";
            String numCalories4 = "";
            String numCalories5 = "";
            String numCalories6 = "";
            String numCalories7 = "";
            String numCalories8 = "";
            String numCalories9 = "";
            String numCalories10 = "";
            String numCalories11 = "";
            String numCalories12 = "";
            String numCalories13 = "";


            /* All of these if statements calculate equivalent exercises and number of calories
            based on which exercise was clicked. All of this info was saved from screen to screen
            due to the storage of the bundle.

             */
            if (whichExercise.equals("Jumping-Jacks")) {

                numCaloriesA = (float) (((numReps) / 0.1));
                numCalories = String.format("%.2f", numCaloriesA);

                numCalories3A = numCaloriesA * 3.5;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 2;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2.25;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 0.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);


                miyaOne.setText("Number of Calories: " + numCalories);

                miyaTwo.setText("Equals " + numCalories3 + " repetitions of pushups, " + numCalories4 + " repetitions of situps, " + numCalories5 + " repetitions of squats, " + numCalories6 + " minutes of leg-lifts, " + numCalories7 + " minutes of planks, " + numCalories8 + " repetitions of pull ups, " + numCalories9 + " minutes of cycling, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");
            } else if (whichExercise.equals("Pushups")) {

                numCaloriesA = (float) (((numReps) / 3.5));
                numCalories = String.format("%.2f", numCaloriesA);


                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);


                numCalories4A = numCaloriesA * 2;
                numCalories4 = String.format("%.2f", numCalories4A);


                numCalories5A = numCaloriesA * 2.25;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 0.25);
                numCalories6 = String.format("%.2f", numCalories6A);


                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);


                numCalories8A = (float) (numCaloriesA);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);


                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);


                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                miyaTwo.setText("Equals " + numCalories3 + " minutes of jumping jacks, " + numCalories4 + " repetitions of situps, " + numCalories5 + " repetitions of squats, " + numCalories6 + " minutes of leg-lifts, " + numCalories7 + " minutes of planks, " + numCalories8 + " repetitions of pull ups, " + numCalories9 + " minutes of cycling, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Situps")) {

                numCaloriesA = (float) (((numReps) / 2));
                numCalories = String.format("%.2f", numCaloriesA);

                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2.25;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 0.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                miyaTwo.setText("Equals " + numCalories3 + " minutes of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of squats, " + numCalories6 + " minutes of leg-lifts, " + numCalories7 + " minutes of planks, " + numCalories8 + " repetitions of pull ups, " + numCalories9 + " minutes of cycling, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");
            } else if (whichExercise.equals("Squats")) {

                numCaloriesA = (float) (((numReps) / 2.25));
                numCalories = String.format("%.2f", numCaloriesA);

                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 0.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);


                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of leg-lifts, " + numCalories7 + " minutes of planks, " + numCalories8 + " repetitions of pull ups, " + numCalories9 + " minutes of cycling, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Leg-lift")) {

                numCaloriesA = (float) (((numReps) / 0.25));
                numCalories = String.format("%.2f", numCaloriesA);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) ((numCaloriesA));
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) ((numCaloriesA));
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);

                miyaTwo.setText("Equals " + numCalories3 + " minutes of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " repetitions of squats, " + numCalories7 + " minutes of planks, " + numCalories8 + " repetitions of pull ups, " + numCalories9 + " minutes of cycling, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Plank")) {

                numCaloriesA = (float) (((numReps) / 0.25));
                numCalories = String.format("%.2f", numCaloriesA);


                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);

                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of squats, " + numCalories7 + " minutes of leg-lifts, " + numCalories8 + " repetitions of pull ups, " + numCalories9 + " minutes of cycling, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Pullup")) {

                numCaloriesA = (float) ((numReps));
                numCalories = String.format("%.2f", numCaloriesA);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA * 0.25);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);

                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of squats, " + numCalories7 + " minutes of leg-lifts, " + numCalories8 + " minutes of planking, " + numCalories9 + " minutes of cycling, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Cycling")) {


                numCaloriesA = (float) (((numReps) / 0.12));
                numCalories = String.format("%.2f", numCaloriesA);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA * 0.25);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.2);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);


                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of squats, " + numCalories7 + " minutes of leg-lifts, " + numCalories8 + " minutes of planking, " + numCalories9 + " repetitions of pull ups, " + numCalories10 + " minutes of walking, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");
            } else if (whichExercise.equals("Walking")) {


                numCaloriesA = (float) (((numReps) / 0.2));
                numCalories = String.format("%.2f", numCaloriesA);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA * 0.25);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.1);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.12);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);


                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of squats, " + numCalories7 + " minutes of leg-lifts, " + numCalories8 + " minutes of planking, " + numCalories9 + " repetitions of pull ups, " + numCalories10 + " minutes of cycling, " + numCalories11 + " minutes of jogging, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Jogging")) {

                numCaloriesA = (float) (((numReps) / 0.12));
                numCalories = String.format("%.2f", numCaloriesA);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA * 0.25);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.12);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.2);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.13);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);

                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of squats, " + numCalories7 + " minutes of leg-lifts, " + numCalories8 + " minutes of planking, " + numCalories9 + " repetitions of pull ups, " + numCalories10 + " minutes of cycling, " + numCalories11 + " minutes of walking, " + numCalories12 + " minutes of swimming, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Swimming")) {

                numCaloriesA = (float) (((numReps) / 0.13));
                numCalories = String.format("%.2f", numCaloriesA);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA * 0.25);
                numCalories8 = String.format("%.2f", numCalories8A);

                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.12);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.2);
                numCalories11 = String.format("%.2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.12);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.15);
                numCalories13 = String.format("%.2f", numCalories13A);

                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of squats, " + numCalories7 + " minutes of leg-lifts, " + numCalories8 + " minutes of planking, " + numCalories9 + " repetitions of pull ups, " + numCalories10 + " minutes of cycling, " + numCalories11 + " minutes of walking, " + numCalories12 + " minutes of jogging, " + numCalories13 + " minutes of stair-climbing");

            } else if (whichExercise.equals("Stair-Climbing")) {

                numCaloriesA = (float) (((numReps) / 0.15));
                numCalories = String.format("%.2f", numCaloriesA);

                miyaOne.setText("Number of Calories: " + numCalories);

                //Number of Pushups
                numCalories3A = numCaloriesA * 0.1;
                numCalories3 = String.format("%.2f", numCalories3A);

                numCalories4A = numCaloriesA * 3.5;
                numCalories4 = String.format("%.2f", numCalories4A);

                numCalories5A = numCaloriesA * 2;
                numCalories5 = String.format("%.2f", numCalories5A);

                numCalories6A = (float) (numCaloriesA * 2.25);
                numCalories6 = String.format("%.2f", numCalories6A);

                numCalories7A = (float) (numCaloriesA * 0.25);
                numCalories7 = String.format("%.2f", numCalories7A);

                numCalories8A = (float) (numCaloriesA * 0.25);
                numCalories8 = String.format("%.2f", numCalories8A);


                numCalories9A = (float) (numCaloriesA);
                numCalories9 = String.format("%.2f", numCalories9A);

                numCalories10A = (float) (numCaloriesA * 0.12);
                numCalories10 = String.format("%.2f", numCalories10A);

                numCalories11A = (float) (numCaloriesA * 0.2);
                numCalories11 = String.format(".2f", numCalories11A);

                numCalories12A = (float) (numCaloriesA * 0.12);
                numCalories12 = String.format("%.2f", numCalories12A);

                numCalories13A = (float) (numCaloriesA * 0.13);
                numCalories13 = String.format("%.2f", numCalories13A);

                miyaTwo.setText("Equals " + numCalories3 + " repetitions of jumping jacks, " + numCalories4 + " repetitions of push ups, " + numCalories5 + " repetitions of sit ups, " + numCalories6 + " minutes of squats, " + numCalories7 + " minutes of leg-lifts, " + numCalories8 + " minutes of planking, " + numCalories9 + " repetitions of pull ups, " + numCalories10 + " minutes of cycling, " + numCalories11 + " minutes of walking, " + numCalories12 + " minutes of jogging, " + numCalories13 + " minutes of swimming");

            }




    }

    // Go back to the home screen.

    public void clickHomeScreen(View v) {

        Intent thirdScreen2 = new Intent(ThirdActivity.this, home.class);

        startActivity(thirdScreen2);
    }



}
