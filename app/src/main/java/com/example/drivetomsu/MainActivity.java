package com.example.drivetomsu;

//Importing necessary packages
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

//creating a class while implementing a listener for the button
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    //creating a button object
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setting button object equal to button display
        button = findViewById(R.id.button);

        //telling listener to listen to the button
        button.setOnClickListener(this);
    }

    //creating an on-click method for when the button is clicked
    @Override
    public void onClick(View view) {

        //creating a uri from intent string. using result to create intent
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");
        //creating intent from gmmIntentUri. setting action to action_view
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,gmmIntentUri);
        //make intent explicit by setting google maps package
        mapIntent.setPackage("com.google.android.apps.maps");
        //attempting to start activity if Google Maps is installed on device
        //if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        //}

    }
}