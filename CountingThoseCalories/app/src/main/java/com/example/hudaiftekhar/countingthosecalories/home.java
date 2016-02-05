package com.example.hudaiftekhar.countingthosecalories;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.content.Intent;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;


public class home extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    /*
    This is the main class of my project. Essentially, the format of the project
    is the following:

    home (main class) --> First (if the user enters in number of minutes) --> ThirdActivity (returns answer) --> home (back to main screen)
                      --> Second (if the user enters in number of reps) --> ThirdActivity (returns answer) --> home (back to main screen)
                      --> ExerciseCalc (if the user enters in number of calories) --> home (Back to main screen) --> home (back to main screen)


     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }



    /* Once you enter the number of calories, minutes, repetitions
    and click the button, it will send you to different screens depending on your choice.
     */
    public void sendNextScreen(View v) {

        EditText textOne =  (EditText) findViewById(R.id.editText);
        String numReps = textOne.getText().toString();

        // This is the radioGroup (out of options of Minutes, Repetitions, and Calories
        RadioGroup radioGroupOne = (RadioGroup) findViewById(R.id.radioGroup5);
        int whichButton = radioGroupOne.getCheckedRadioButtonId();

        RadioButton radioButtonOne = (RadioButton) findViewById(whichButton);
        String text = radioButtonOne.getText().toString();


        if (text.equals("Minutes")) {
            Intent firstScreen = new Intent(home.this, First.class);

            firstScreen.putExtra("numReps", numReps);
            startActivity(firstScreen);
            // we store number of minutes entered and it takes us to separate activity
            // First.class only contains exercises that use that unit


        }
        else if (text.equals("Repetitions")) {
            Intent secondScreen = new Intent(home.this, SecondActivity.class);

            secondScreen.putExtra("numReps", numReps);
            startActivity(secondScreen);

            // we store number of repetitions entered and it takes us to separate
            // activity SecondActivity.class only contains exercises that use that unit
        }
        else if (text.equals("Calories")) {
            Intent firstScreen1 = new Intent(home.this, ExerciseCalc.class);

            firstScreen1.putExtra("numReps1", numReps);
            startActivity(firstScreen1);

            // we store number of calories they want to do, and that will take us
            // to separate Activity Exercise Calc so the user can see how much of
            // each exercise they need to do.
        }




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }





    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "home Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.hudaiftekhar.countingthosecalories/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "home Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.example.hudaiftekhar.countingthosecalories/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}


